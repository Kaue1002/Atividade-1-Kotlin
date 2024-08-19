fun main(args: Array<String>) {

    var idade1 = 20
    var salariobruto = 1700
    var nome: String = "Kaue"
    var mesestrab = 12
    var quantprod = 3

    var salarioanual = salariobruto * mesestrab
    var desconto = 1000
    var salarioliq = salarioanual - desconto

    var prod1 = 25
    var prod2 = 10
    var prod3 = 1

    var somavalorprod = prod1 + prod2 + prod3
    var medvalor = somavalorprod / quantprod


    println("Meu nome é $nome, e meu salario anual é de $salarioliq")

    println("Tenho $idade1 anos")
    println("Meu salario bruto é de $salariobruto")
    println("Meu salario anual é de $salarioanual")
    println("Produto 1 valor $prod1")
    println("Produto 2 valor $prod2")
    println("Produto 3 valor $prod3")
    println("A media de valor dos produtos é de $medvalor")
}
