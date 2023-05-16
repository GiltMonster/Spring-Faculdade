

function Formulario() {
    return (
        <>
            <form>
                <div className="mb-3">
                    <h1>Cadastro:</h1>
                    <input type="text" className="form-control my-2" placeholder="Nome:" />
                    <input type="date" className="form-control my-2" placeholder="Data do cadastro:" />
                </div>

                <div className="form-check mb-3" >
                    <input type="checkbox" className="form-check-input" id="check" />
                    <label className="form-check-label" htmlFor="check">Ativo?</label>

                </div>

                <input type="submit" className="btn btn-success mx-1" value={"Salvar"} />
            </form>
        </>
    );
}

export default Formulario;