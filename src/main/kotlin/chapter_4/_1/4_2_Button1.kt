package chapter_4._1

class Button1 : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {/* ... */}

    class ButtonState : State {/*...*/}
}