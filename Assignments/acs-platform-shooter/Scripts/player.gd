class_name Player
extends CharacterBody2D

@export var speed: float = 220.0
@export var jump_velocity: float = -420.0
@export var bullet_scene: PackedScene

@onready var sprite: AnimatedSprite2D = $AnimatedSprite2D
@onready var muzzle: Marker2D = $Muzzle

var score: int = 0
var facing: int = 1

func _ready() -> void:
	add_to_group("player")

func _physics_process(delta: float) -> void:
	if not is_on_floor():
		velocity += get_gravity() * delta

	if Input.is_action_just_pressed("jump") and is_on_floor():
		velocity.y = jump_velocity

	var dir := Input.get_axis("move_left", "move_right")
	velocity.x = dir * speed
	if dir != 0.0:
		facing = int(sign(dir))
		sprite.flip_h = facing < 0
		muzzle.position.x = abs(muzzle.position.x) * facing

	if Input.is_action_just_pressed("shoot"):
		_shoot()

	move_and_slide()

func _shoot() -> void:
	if bullet_scene == null: return
	var b: Node = bullet_scene.instantiate()
	b.global_position = muzzle.global_position
	b.direction = facing
	get_tree().current_scene.add_child(b)
