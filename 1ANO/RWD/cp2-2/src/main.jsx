import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import { RouterProvider, createBrowserRouter } from 'react-router-dom'
import Home from './routes/Home/index.jsx'
import Error from './routes/Error/index.jsx'
import Aparelhos from './routes/Aparelhos/index.jsx'
import VisualizarAparelho from './routes/VisualizarAparelho/index.jsx'

const router = createBrowserRouter([
  {
    path: '/',
    element: <App/>,
    errorElement: <Error/>,
    children:[
      {
        path: '/',
        element: <Home/>
      },
      {
        path: '/aparelhos',
        element: <Aparelhos/>
      },
      {
        path: '/aparelho/visualizar/:id',
        element: <VisualizarAparelho/>
      }
    ]
  }
])

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router}/>
  </React.StrictMode>,
)
