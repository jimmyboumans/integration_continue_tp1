var tableBody = document.getElementById("tableBody")

for (var i = 0; i < 5; i++) {
    var tr = document.createElement('tr')
    var th = document.createElement('th')
    th.setAttribute("scope", "row")
    th.innerHTML = i + 1
    tr.appendChild(th)
    for (var j = 0; j < 4; j++) {
        var td = document.createElement('td')
        td.innerHTML = "testetest"
        tr.appendChild(td)
    }
    tableBody.appendChild(tr)

}
