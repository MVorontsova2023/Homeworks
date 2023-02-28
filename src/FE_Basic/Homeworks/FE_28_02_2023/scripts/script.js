// Создать кнопку и красный квадрат с размерами 200х200px. При клике на кнопку менять у квадрата цвет заднего фона на зеленый и уменьшать его до размеров 100х100px.
// const divMain = document.querySelector("div.main")
// const div = document.createElement("div")
// div.setAttribute("id", "box")
// div.setAttribute("style", "width:200px; height:200px; background-color:red;")
// const button = document.createElement("button")
// button.innerText = 'toGreen'
// button.setAttribute("style", "margin:50px; ")
// button.addEventListener("click", function() {
//     const divBox = document.querySelector("div#box")
//     divBox.setAttribute("style", "width:100px; height:100px; background-color:green;")
// })
// divMain.append(div)
// divMain.append(button)


// Создать кнопку и розовый квадрат с размерами 200х200px. При клике на кнопку менять цвет на синий и выводить в консоль обновленный цвет квадрата.
// const divMain = document.querySelector("div.main")
// const div = document.createElement("div")
// div.setAttribute("id", "box")
// div.setAttribute("style", "width:200px; height:200px; background-color:pink;")
// const button = document.createElement("button")
// button.innerText = 'toBlue'
// button.setAttribute("style", "margin:50px; ")
// button.addEventListener("click", function() {
//     const divBox = document.querySelector("div#box")
//     divBox.setAttribute("style", "width:100px; height:100px; background-color:blue;")
//     console.log('blue')
// })
// divMain.append(div)
// divMain.append(button)


// Создать кнопку и квадрат с размерами 150х150px. При клике на кнопку увеличивать высоту и ширину квадрата на 20px.
// const divMain = document.querySelector("div.main")
// const div = document.createElement("div")
// div.setAttribute("id", "box")
// div.setAttribute("style", "width:150px; height:150px; background-color:pink;")
// const button = document.createElement("button")
// button.innerText = 'toBlue'
// button.setAttribute("style", "margin:50px; ")
// button.addEventListener("click", function() {
//     const divBox = document.querySelector("div#box")
//     divBox.setAttribute("style", "width:170px; height:170px; background-color:blue;")
//     console.log('blue')
// })
// divMain.append(div)
// divMain.append(button)


// Создать кнопку и div с классом root. При клике на кнопку в div создается параграф синего цвета. Текст параграфа произвольный.
// const divMain = document.querySelector("div.main")
// const div = document.createElement("div")
// div.setAttribute("class", "root")
// div.setAttribute("style", "width:150px; height:150px; background-color:purple;")
// const button = document.createElement("button")
// button.innerText = 'addP'
// button.setAttribute("style", "margin:50px; ")
// button.addEventListener("click", function() {
//     const divBox = document.querySelector("div.root")
//     const newParagraph = document.createElement("p")
//     newParagraph.innerText = 'newParagraph'
//     newParagraph.setAttribute("style", "color:blue;")
//     divBox.append(newParagraph)
// })
// divMain.append(div)
// divMain.append(button)

// Создать кнопку и div с классом root. При клике на кнопку в div создаются по очереди параграфы синего и зеленого цветов. Первый цвет синий.
const divMain = document.querySelector("div.main")
const div = document.createElement("div")
div.setAttribute("class", "root")
div.setAttribute("style", "width:150px; height:150px; background-color:pink;")
const button = document.createElement("button")
button.innerText = 'addPs'
button.setAttribute("style", "margin:50px; ")
button.addEventListener("click", function() {
    const divBox = document.querySelector("div.root")
    const newParagraph1 = document.createElement("p")
    newParagraph1.innerText = 'newParagraph'
    newParagraph1.setAttribute("style", "color:blue;")
    divBox.append(newParagraph1)
    const newParagraph2 = document.createElement("p")
    newParagraph2.innerText = 'newParagraph'
    newParagraph2.setAttribute("style", "color:green;")
    divBox.append(newParagraph2)
})
divMain.append(div)
divMain.append(button)
