fun main() {
    val saludo:String = ":: Bienvenido a Recipe Maker ::\n"
    val instruccion:String = "Selecciona la opción deseada"
    val menu:List<String> = listOf<String>("1. Hacer una receta", "2. Ver mis recetas", "3. Salir")
    var response:String?; var default_msg:Boolean = true
    salir@while(true) {
//        if(default_msg) {
            println(saludo + instruccion)
            for (i in menu) println(i)
//        }
        response = readLine()
        when (if(response == "") 0 else response?.toInt() ?: 0) {
            1 -> {  println("Usted seleccionó: " + menu[0]);
                    makeRecipe()
                    response = readLine()
                    default_msg = false
                }
            2 -> {println("Usted seleccionó: " + menu[1]); default_msg = false}
            3 -> break@salir
            else -> default_msg = true //println("$instruccion${menu.forEach{print(it)}}")
        }
    }
}

fun makeRecipe(){
    println("Hacer Receta\nSelecciona por categoria el ingrediente que buscas:")
    val categoria: List<String> = listOf<String>("1. Agua", "2. Leche", "3. Carne",
        "4. Verduras", "5. Frutas", "6. Cereal", "7. Huevos", "8. Aceites")
    categoria.forEach{println(it)}
}

fun viewRecipe(){
    print("Ver mis recetas")
}