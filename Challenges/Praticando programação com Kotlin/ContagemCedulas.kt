/**
 * Desafio:
 * Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
 * onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
 * Na sequência mostre o valor lido e a relação de notas necessárias.
 *
 * Entrada:
 * Você receberá um valor inteiro N (0 < N < 1000000).
 *
 * Saída:
 * Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo.
 * Após cada linha deve ser imprimido o fim de linha.
 */

import java.util.Scanner

fun main(args: Array<String>) {
    
    var value = readLine()!!.toInt()
    var hundred = 0
    var fifty = 0
    var twenty = 0
    var ten = 0
    var five = 0
    var two = 0
    var one = 0
  
    println(value)
  
    if (value >= 100) {
      hundred = value / 100
      value %= 100
    }
    if (value >= 50) {
      fifty = value / 50
      value %= 50
    }
    if (value >= 20) {
      twenty = value / 20
      value %= 20
    }
    if (value >= 10) {
      ten = value / 10
      value %= 10
    }
    if (value >= 5) {
      five = value / 5
      value %= 5
    }
    if (value >= 2) {
      two = value / 2
      value %= 2
    }
    if (value >= 1) {
      one = value / 1
      value %= 1
    }
  
    println("$hundred nota(s) de R\$ 100,00")
    println("$fifty nota(s) de R\$ 50,00")
    println("$twenty nota(s) de R\$ 20,00")
    println("$ten nota(s) de R\$ 10,00")
    println("$five nota(s) de R\$ 5,00")
    println("$two nota(s) de R\$ 2,00")
    println("$one nota(s) de R\$ 1,00")
}