import React from 'react';
import './App.css'
import Footer from './components/Footer';
import Navbar from './components/Navbar';
import Main1 from './components/Main1';
import Main2 from './components/Main2';
import { BrowserRouter, Routes, Route } from 'react-router-dom';


function App() {
  return (
    <BrowserRouter>
    <Navbar />
      <Routes>
          <Route exact path={"/main1"} element={<Main1 />} />
          <Route exact path={"/main2"} element={<Main2 />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
