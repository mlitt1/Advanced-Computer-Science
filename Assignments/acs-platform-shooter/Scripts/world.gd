extends Node2D

func _ready() -> void:
	for enemy in get_tree().get_nodes_in_group("enemies"):
		enemy.died.connect(_on_enemy_died)

func _on_enemy_died(_position: Vector2) -> void:
	ScoreManager.add(100)
