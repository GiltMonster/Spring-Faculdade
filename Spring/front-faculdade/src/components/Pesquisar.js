import axios from "axios";

import {useState } from "react";

export default function Pesquisar() {

    const [alunoBuscado, setAlunoBuscado] = useState("");
    const [newAlunoBuscado, setNewAlunoBuscado] = useState();





    function buscar() {
         
        
        axios.get(`http://localhost:8080/faculdade/nome/${alunoBuscado}`)
            .then((resp) => {

                setNewAlunoBuscado(resp.data);
                console.log(newAlunoBuscado);
                console.log(alunoBuscado);
            }).catch((error) => {
                if (error.response) {
                    // A requisição foi feita e o servidor respondeu com um código de status
                    // que sai do alcance de 2xx
                    console.error(error.response.data);
                    console.error(error.response.status);
                    console.error(error.response.headers);
                } else if (error.request) {
                    // A requisição foi feita mas nenhuma resposta foi recebida
                    // `error.request` é uma instância do XMLHttpRequest no navegador e uma instância de
                    // http.ClientRequest no node.js
                    console.error(error.request);
                } else {
                    // Alguma coisa acontenceu ao configurar a requisição que acionou este erro.
                    console.error('Error', error.message);
                }
                console.error(error.config);
            });
    }

    return (
        <div className="container">
            
                <div className="mb-3">
                    <h1>Pesquisar:</h1>
                    <input type="text" className="form-control my-2" placeholder="Nome:" onChange={e => setAlunoBuscado(e.target.value)}/>
                </div>
                <div className="">
                    <button className="btn btn-warning mx-1" onClick={buscar}>Buscar</button>
                </div>
        </div>
    );
}