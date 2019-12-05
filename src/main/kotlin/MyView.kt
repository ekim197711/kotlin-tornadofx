import tornadofx.*

class MyView: View(){
    override val root = vbox {
        label("Hello im also a label")
        button("Click here im a button")
        button("Another button")
        label("Look im a label")
    }
}