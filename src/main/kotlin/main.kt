import kotlinx.browser.document
import kotlinx.html.dom.append
import kotlinx.html.js.*

fun main() {

    document.getElementById("app")
        ?.also { it.innerHTML = "" }
        ?.append {
            h1 { +"That was absolutely the right thing to do" }
        }
    document.write("Bingo!")
}