import './App.css';
import Formulario from './components/Formulario';
import Tabela from './components/Tabela';
import { Route, Routes } from 'react-router-dom';
import Excluir from './components/Excluir';
import Pesquisar from './components/Pesquisar';
import NotFound from './components/NotFound';
import Nav from './components/Nav';

function App() {



  return (
      <div>
        <div className="App">
          <div className="container">
          <Nav />

          </div>

          <Routes>
            <Route path="/" index element={<Formulario/>}/>
            <Route path="/listar" element={<Tabela />} />
            <Route path="/excluir" element={<Excluir />} />
            <Route path="/pesquisar" element={<Pesquisar />} />
            <Route path="/*" element={<NotFound />} />
          </Routes>
        </div>
      </div>

     
  );
}

export default App;
