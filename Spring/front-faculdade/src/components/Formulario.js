import axios from "axios";
import { useRef } from "react";


function Formulario() {

    const nomeRef = useRef(null);
    const dataRef = useRef(null);
    const ativoRef = useRef(false);

    function salvar() {
        console.log(`Nome: ${nomeRef.current.value}, Data: ${dataRef.current.value}, Ativo: ${ativoRef.current.value}`)
        axios.post("http://localhost:8080/faculdade",{
            nome: nomeRef.current.value,
            dataCadastro: dataRef.current.value,
            ativo: true

        }).then(function (response) {
            console.log(response);

        }).catch(function (error) {
            console.error(error);
          });

    }
    
    return (
        <>

            <form method="POST">
                <div className="mb-3">
                    <h1>Cadastro:</h1>
                    <input type="text" className="form-control my-2" placeholder="Nome:"  ref={nomeRef}/>
                    <input type="date" className="form-control my-2" placeholder="Data do cadastro:" ref={dataRef}/>
                </div>

                <div className="form-check mb-3" >
                    <input type="checkbox" className="form-check-input" id="check" ref={ativoRef}/>
                    <label className="form-check-label" htmlFor="check">Ativo?</label>
                </div>

                <input className="col-12 btn btn-success mx-1" value={"Salvar"}  onClick={salvar}/>
            </form>
        </>
    );
}

export default Formulario;