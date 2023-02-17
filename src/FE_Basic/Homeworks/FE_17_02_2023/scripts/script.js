//Напишите цикл for, который выводит консоль каждое второе число от 0 до 10
// for (let i = 0; i < 10; i++) {
//     if (i%2 == 1)
//         console.log(i)
// }

// Напишите цикл for, который выводит в консоль  все числа от 55 до 20

// for (let i = 55; i >= 20; i--) {
//     console.log(i)
// }

// Дан массив numbers. Вывести в консоль все числа из массива
// const numbers = [2, 1, 3, 5, 2, 6, 7]
// for (let i = 0; i < numbers.length; i++) {
//     if (typeof(numbers[i]) == 'number') {
//         console.log(numbers[i])
//     }
// }

// Сформировать новый массив numberssquared и передать в него все элементы из массива numbers, возведенные в квадрат
const numbers = [3, 5, 11, 2, 8, 1, 6];
var numberssquared = [numbers.length]
for (let i = 0; i < numbers.length; i++) {
    numberssquared[i] = numbers[i]**2
    console.log(numberssquared[i])
}

// Создать переменную lastelem и передать в нее последний элемент из сформированного массива numbers_squared (обратиться к элементу массива по индексу)
var lastelem = numberssquared[numberssquared.length - 1];
console.log(lastelem)

// Дан объект user. Используя данные из объекта, сформировать строку в формате: ‘User’s name is  . He is  years old’
const user = {
    firstname: 'Ivan', 
    lastname: 'Ivanov', 
    age: 20, 
    salary: 500
    }

console.log("User's name is " + user.firstname + ". He is " + user.age + " years old")
