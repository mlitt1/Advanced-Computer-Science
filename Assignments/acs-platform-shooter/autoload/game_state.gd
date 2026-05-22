extends Node

enum State { MENU, PLAYING, PAUSED, GAME_OVER }
var current: State = State.MENU

func change_to(new_state: State) -> void:
	current = new_state
	match current:
		State.PAUSED:
			get_tree().paused = true
		State.PLAYING:
			get_tree().paused = false
		_:
			get_tree().paused = false
	print("GameState -> ", State.keys()[current])
