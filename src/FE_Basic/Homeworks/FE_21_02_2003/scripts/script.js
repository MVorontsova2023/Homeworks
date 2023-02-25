// //Напишите функцию, которая принимает два числовых аргумента и возвращает наименьшее из них.
// function getNumber(n1,n2) {
//     if (n1 < n2) 
//         return n1;    
//      else 
//         return n2;
// }
    
// console.log(getNumber(1,111))

// // Напишите функцию, которая принимает два числовых аргумента и выводит в консоль все четные числа от большего к меньшему.
// function printEven(a,b) {

//     if (a<b) {

//         for (let i= b; i >= a; i--) { 
//             if (i % 2 === 0) 
//                 console.log(i);
//         }
//     } else {

//         for (let i= a; i >= b; i--) { 
//             if (i % 2 === 0) 
//                 console.log(i);
//         }
//     }
// }
// console.log(printEven(1,111))

// // Напишите функцию power, которая принимает два числовых аргумента (основание степени и саму степень) и возвращает число в указанной степени. 
// Значение степени должно быть указано по умолчанию 2.
// function power(a,b=2) {
//     return a ** b
// }
// console.log(power (6))


// Напишите функцию, которая принимает числовой аргумент n и считает сумму чисел от 1 до n.
// function getNumber (n) {
//     let sum = 0
//     for (let index = 1; index <= n; index++) {
//         sum += index
//     }

//     return sum
// }
            
// console.log(getNumber(2))

// Напишите функцию, которая принимает два числовых аргумента n и m и считает сумму четных чисел и нечетных чисел от n до m. 
// Суммы выведите в консоль (в начале сумму четных чисел, а затем сумму нечетных).
function evenOdd(n,m) {
    let evenNum = 0
    let oddNum = 0

    for ( let index =n; index <= m; index ++) {
        if (index % 2 === 0) 
            evenNum += index;
        else 
            oddNum += index
        
    }

    console.log("Sum of even Numbers from %d to %d  is %d", n,m,evenNum)
    console.log("Sum of odd Numbers from %d to %d  is %d",n,m,oddNum)
}

evenOdd(1,5);