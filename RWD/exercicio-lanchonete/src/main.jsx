import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import './index.scss'
import { RouterProvider, createBrowserRouter } from 'react-router-dom'
import { Error } from './routes/Error/Error.jsx'
import { Home } from './routes/Home/Home.jsx'
import { Cardapio } from './routes/Cardapio/Cardapio.jsx'
import { Pedidos } from './routes/Pedidos/Pedidos.jsx'

const router = createBrowserRouter([
  {
    path: '/',
    element: <App/>,
    errorElement: <Error/>,
    children: [
      {
        path: '/',
        element: <Home/>
      },
      {
        path: '/cardapio',
        element: <Cardapio/>
      },
      {
        path: '/pedidos',
        element: <Pedidos/>
      }
    ]
  }
])

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router}/>
  </React.StrictMode>,
)
