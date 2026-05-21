class_name Player
extends CharacterBody2D

@export var speed: float = 222.0
@export var jump_velocity: float = -200.0;
#when thew player monkey is loaded automatically assign the sprite var of type Animated
#Sprite2D to teh child node of the same name
@onready var sprite: AnimatedSprite2D = $AnimatedSprite2D

var score: int = 0;

func _ready() -> void:
	print("Player ready ", name)
	add_to_group("player")

func _physics_process(delta: float) -> void:
	#horizontal movement
	var dir = Input.get_axis("move_left", "move_right")
	velocity.x = dir * speed
	
	if Input.is_action_just_pressed("jump"):
		velocity.y = jump_velocity
		
	if dir != 0.0:
		sprite.flip_h = dir < 0.0
		
	move_and_slide()
