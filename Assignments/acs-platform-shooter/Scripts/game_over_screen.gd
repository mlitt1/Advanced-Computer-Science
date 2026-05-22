extends Control

func _ready() -> void:
	$CenterContainer/VBoxContainer/RetryButton.pressed.connect(_on_retry_pressed)
	$CenterContainer/VBoxContainer/MenuButton.pressed.connect(_on_menu_pressed)

func _on_retry_pressed() -> void:
	ScoreManager.reset()
	GameState.change_to(GameState.State.PLAYING)
	get_tree().change_scene_to_file("res://scenes/world.tscn")

func _on_menu_pressed() -> void:
	ScoreManager.reset()
	GameState.change_to(GameState.State.MENU)
	get_tree().change_scene_to_file("res://scenes/main.tscn")
