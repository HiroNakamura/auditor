
let Controlador = {

    visitantes: function(){
        
        const contenidoVisitantes = document.querySelector("#contenido");
        console.log("Javascript activo y funcionando!!")

        fetch('http://localhost:8080/apirest/visitantes')
        .then(response =>{
            return response.json()
        })
        .then(response =>{
            contenidoVisitantes.innerHTML ="";
            console.log(response)
            for(let dato of response){
                contenidoVisitantes.innerHTML +=`
                <tr>
              <th>${dato.fecha}</th>
              <td>${dato.comentario}</td>
            </tr>
            `
           }
        });

    },
    computadoras: function(){
        console.log("Hola, amigos");
    }
}


window.addEventListener("load", Controlador.visitantes);
window.addEventListener("load", Controlador.computadoras);
