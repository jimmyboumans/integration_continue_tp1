// TODO: Refacto en cours
const urll = {
    articles: "http://localhost:3000/users",
    clients: "url here",
    groupeContrat: "url here",
}

async function getData(url) {
    try {
        const a = await fetch(url)
        return a.json()
    } catch (e) {
        console.error(e)
    }
}
