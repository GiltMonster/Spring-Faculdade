import { Link } from "react-router-dom";

export default function Nav() {
    return (
        <header className="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
            <h1 className="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            CRUD faculdade
            </h1>

            <ul className="nav nav-pills">
                <li className="nav-item"><Link className="btn btn-primary mx-1" aria-current="page"to={"/"}>Cadastrar</Link></li>
                <li className="nav-item"><Link className="btn btn-success mx-1" to={"/listar"}>Listar</Link></li>
                <li className="nav-item"><Link className="btn btn-danger mx-1" to={"/excluir"}>Excluir</Link></li>
                <li className="nav-item"><Link className="btn btn-warning mx-1" to={"/pesquisar"}>Pesquisar</Link></li>
            </ul>
        </header>
    )
}