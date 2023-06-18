package ru.netology

fun main() {
    val totalPrice = 5_060
    val isRegularCustomer = true

    val firstDiscountStart = 1_001
    val secondDiscountStart = 10_001

    val discount = if (totalPrice < firstDiscountStart) 0
    else if (totalPrice < secondDiscountStart) 100
    else (totalPrice * 0.05).toInt()

    val discountText = if (totalPrice < firstDiscountStart) "Скидки нет"
    else if (totalPrice < secondDiscountStart) "100 р."
    else "5%"

    val totalPriceByPromotion = totalPrice - discount

    val discountOfRegularCustomer = if (isRegularCustomer) (totalPriceByPromotion * 0.01).toInt() else 0

    val result = totalPriceByPromotion - discountOfRegularCustomer

    println("Сумма покупки - $totalPrice р.")
    println("Скидка по акции ($discountText) - $discount р.")
    println("Скидка постоянного покупателя (1%) - $discountOfRegularCustomer р.")
    println("Сумма с учетом скидок - $result р.")
}