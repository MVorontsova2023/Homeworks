
// Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50). 
// Добавить созданные параграфы в div с классом numbers.

// const div = document.querySelector("div.main")

// for (let index = 100; index >= 50; index-=10) {
//     const newParagraph = document.createElement("p")
//     newParagraph.setAttribute("class", "numbers")
//     newParagraph.innerText = index
//     div.append(newParagraph)
// }

// Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом stringscontainer. Строки взять произвольные.

// const div = document.querySelector("div.main")
// const arr = ["aaa", "bbb"]
// for (let index = 0; index < arr.length; index++) {
//     const newParagraph = document.createElement("p")
//     newParagraph.setAttribute("class", "stringscontainer")
//     newParagraph.innerText = arr[index]
//     div.append(newParagraph)
// }

// Написать цикл, который проходится по массиву с объектами - у объектов свойства firstname, lastname и  age (данные взять произвольные) 
// - и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя. 
// Добавить все карточки в div с классом userscontainer.

const div = document.querySelector("div.userscontainer")
const arr = [{firstname:"Anna", lastname:"Ivanova", age:30},{firstname:"Ivan", lastname:"Ivanov", age:17}]
for (let index = 0; index < arr.length; index++) {
    if (arr[index].age>=18) {
        const userCardElem = document.createElement("div")
        userCardElem.setAttribute("class", "userCard")
        const firstNameParagraph = document.createElement("p")    
        firstNameParagraph.innerText = arr[index].firstname
        userCardElem.append(firstNameParagraph)
        const lastNameParagraph = document.createElement("p")    
        lastNameParagraph.innerText = arr[index].lastname
        userCardElem.append(lastNameParagraph)
        const ageParagraph = document.createElement("p")    
        ageParagraph.innerText = arr[index].age
        userCardElem.append(ageParagraph)
        div.append(userCardElem)
    }
    
}