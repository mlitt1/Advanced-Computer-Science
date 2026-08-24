class_name Enemy
extends CharacterBody2D

signal died(position: Vector2)

@export var patrol_speed: float = 60.0
@export var max_health: int = 2

var health: int = max_health
var patrol_dir: int = 1

func _ready() -> void:
	add_to_group("enemies")

func _physics_process(delta: float) -> void:
	if not is_on_floor():
		velocity += get_gravity() * delta
	velocity.x = patrol_dir * patrol_speed
	move_and_slide()
	if is_on_wall():
		patrol_dir *= -1

func take_damage(amount: int) -> void:
	health -= amount
	if health <= 0:
		died.emit(global_position)
		queue_free()
