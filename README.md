* PACKAGE model = Содержит класс родитель с классами наследниками. Элементы из которых будет состоять калькулятор 
ModelNumber, NextNumber, Operation, Result
* PACKAGE service = Содержит бизнес логику
ArifmeticOperation = Арифметические операции, взаимодейтсвие между элементами
interface СalcBihevior = методы которые содержится в ArifmeticOperation 
CheckOperand = возпроизводит последовательность и логику работы между элементами 
interface СheckOperations = методы которые содержится в CheckOperand 
GetOperand = Реализует проверку числа и оператор, которое вводит пользователь 
interface getOperations = методы которые содержится в GetOperand 
* PACKAGE view = Содержит последовательность работы программы и разделяет ответственность (MVC)
interface viewBihavior = методы которые содержится в view 
* PACKAGE controller = Содержит проверку операций, взаимодействует с view, arifmeticOperation и разделяет ответственность (MVC)
* MAIN = Вывод 



 
 
