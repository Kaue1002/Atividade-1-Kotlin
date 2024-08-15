fun main(args: Array<String>) {

    var idade1: Int = 20
    var salariobruto: Double = 1.700
    var nome: String = "Kaue"
    var mesestrab: Int = 12
    var quantprod: Int = 3

    var salarioanual: Double = salariobruto * mesestrab
    var desconto: Double = 1.000
    var salarioliq: Double = salarioanual - desconto

    var prod1: Double = 25.5
    var prod2: Double = 10.0
    var prod3: Double = 7.0

    var somavalorprod: Double = prod1 + prod2 + prod3
    var medvalor: Double = somavalorprod / quantprod


    println("Meu nome é $nome, e meu salario anual é de $salarioliq")
}