extends Node2D

@export var next_level: PackedScene

func _ready() -> void:
	for enemy in get_tree().get_nodes_in_group("enemies"):
		enemy.died.connect(_on_enemy_died)
	$ExitDoor.body_entered.connect(_on_exit_entered)

func _on_enemy_died(_position: Vector2) -> void:
	ScoreManager.add(100)

func _on_exit_entered(body: Node2D) -> void:
	if body.is_in_group("player") and next_level:
		# body_entered fires mid-physics; defer the swap so it runs
		# after the physics step finishes instead of during it.
		get_tree().change_scene_to_packed.call_deferred(next_level)
