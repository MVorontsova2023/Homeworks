// через prompt считывает число и выводит в консоль число равное 10% от введенного числа

// const num = +prompt("Write a number")
// console.log(`10% of ${num} is ${num/10}`)

// получает два числа и выводит наименьшее

// const value_1 = +prompt("Write first number")
// const value_2 = +prompt("Write seconf mumber")

// if (value_1 > value_2) {
//     console.log("Value2 is less than value1")
// } else if(value_1 != value_2) {
//     console.log("value1 is less than value2")
// } else {
//     console.log("value1 is equeal to value2")
// }

// считывает через prompt число и выводит одно из следующих сообщений: ‘Число меньше 100’, ‘Число больше 100’ или ‘Число равно 100’

// const value = +prompt("Write a number")

// if (value < 100) {
//     console.log("число меньше 100")
// } else if (value > 100) {
//     console.log("число больше 100")
// } else {
//     console.log("число равно 100")
// }

// запрашивает у пользователя его имя и возраст (в годах) и выводит в консоль сообщение ‘Hello, ’, если пользователь совершеннолетний, или ‘Hi, ’, если пользователь несовершеннолетний.

// const age = +prompt("Write your age")

// if (age < 18) {
//     console.log("Hi, ")
// } else {
//     console.log("Hello, ")
// }

// Создайте массив из строк, чисел, NaN и объектов. Пример: ['hello', 1, { name: 'John' }, 'world', 2, { name: 'Jane' }, NaN]

const arr = ['hello', 1, { name: 'John' }, 'world', 2, { name: 'Jane' }, NaN]

// Задача 1 - Пройдитесь по массиву циклом for и выведите в консоли, чем является каждый элемент массива: строкой, числом или ни тем, ни другим (используя функции isNaN и typeof).
// for (let i = 0; i < arr.length; i++) {
//     console.log(arr[i])
//     if (typeof(arr[i]) == 'string') {
//         console.log("this is string")
//     }
//     else if (typeof(arr[i]) == 'number') {
//         console.log("this is number")
//     }
//     else {
//         console.log("typeof is not string and is not number")
//     }

//     if (isNaN(arr[i]) == true) {
//         console.log("this is NaN")
//     }
//     else {
//         console.log("this is not NaN")
//     }
// }


// Задача 2 - Просуммируйте все числа в массиве и выведите результат в консоли. Игнорируйте нечисловые элементы.
var sum = 0
for (let i = 0; i < arr.length; i++) {
    if (isNaN(arr[i]) == false) {
        console.log(arr[i])
        sum += arr[i]
    }
}

console.log('Sum: ' + sum)
