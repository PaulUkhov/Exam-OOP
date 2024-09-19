# Описание проекта: Java Калькулятор

Данный проект представляет собой реализацию калькулятора, организованного с использованием принципов ООП и паттерна MVC. Проект разделен на несколько пакетов, каждый из которых отвечает за определенную логику работы приложения.

## 1. **PACKAGE model**
Содержит основной класс, родитель, с классами-наследниками. Эти элементы составляют структуру калькулятора:

- `ModelNumber` — модель числа.
- `NextNumber` — следующее число.
- `Operation` — операции калькулятора.
- `Result` — результат вычислений.

## 2. **PACKAGE service**
Содержит бизнес-логику приложения:

- `ArifmeticOperation` — содержит арифметические операции и взаимодействие между элементами.
- `interface СalcBihevior` — описывает методы, используемые в `ArifmeticOperation`.
- `CheckOperand` — выполняет последовательность и логику работы элементов.
- `interface CheckOperations` — содержит методы, которые используются в `CheckOperand`.
- `GetOperand` — реализует проверку числа и оператора, которые вводит пользователь.
- `interface getOperations` — методы, описанные в `GetOperand`.

## 3. **PACKAGE view**
Реализует последовательность работы программы и разделение ответственности (по паттерну MVC):

- `interface viewBihavior` — описывает методы, используемые во `view`.

## 4. **PACKAGE controller**
Контролирует выполнение операций, взаимодействует с `view` и `arifmeticOperation`, а также разделяет ответственность (MVC).

## 5. **MAIN**
Отвечает за вывод и исполнение программы.

---

### Основные характеристики:
- Использование ООП.
- Паттерн MVC.
- Четкое разделение логики и ответственности между компонентами программы.

 
 
