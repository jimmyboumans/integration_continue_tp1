// TODO: Refacto en cours
const url = {
    articles: "http://localhost:3000/users",
    clients: "url here",
    groupeContrat: "url here",
}

async function getData(url) {
    try {
        const a = await fetch(url)
        // const resp = await a.json()
        // console.log(resp)
        return a.json()
    } catch(e) {
        console.error(e)
    }
}
