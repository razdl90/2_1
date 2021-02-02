fun main() {

    val amount : Double = 600000.0;         //в копейках
    val rub : Double = amount/100;          //в рублях
    val fee : Double = rub * 0.75/100       //0,75% комиссия
    if (fee < 35){
        println("комиссия составит 35 рублей")
    } else{
        println("комиссия составит " + fee + " рублей")
    }

}