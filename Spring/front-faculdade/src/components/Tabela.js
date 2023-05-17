import  axios  from "axios";
import { useEffect, useState } from "react";

function Tabela() {


    const [alunos, setAlunos] = useState({});

    useEffect(() => {
        listar();
    },[])

    function listar() {
        setAlunos(axios.get("http://localhost:8080/faculdade/listar")
        .then((resp)=>{
            setAlunos(resp.data);
            console.log(resp.data); 

        }).catch((error)=>{
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
          }));

        // fetch("http://localhost:8080/faculdade/listar")
        //   .then(res => res.json())
        //   .then(data => setAlunos(data))
    }

    return (

        alunos ?
            <div className="container">
                <table className="table">
                    <thead>
                        <tr>
                            <th scope="col">RA:</th>
                            <th scope="col">Nome:</th>
                            <th scope="col">Data do cadastro:</th>
                            <th scope="col">Ativo:</th>
                            <th scope="col">Excluir:</th>
                            <th scope="col">Editar:</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                    </tbody>
                    
                </table>
            </div>

            :
            <div className="spinner-grow text-primary" role="status">
                <span className="visually-hidden">Loading...</span>
            </div>


    );
}

export default Tabela;