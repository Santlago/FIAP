"use strict";
/*
 * ATTENTION: An "eval-source-map" devtool has been used.
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file with attached SourceMaps in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
self["webpackHotUpdate_N_E"]("app/incluir/[id]/page",{

/***/ "(app-pages-browser)/./src/app/incluir/[id]/page.jsx":
/*!***************************************!*\
  !*** ./src/app/incluir/[id]/page.jsx ***!
  \***************************************/
/***/ (function(module, __webpack_exports__, __webpack_require__) {

eval(__webpack_require__.ts("__webpack_require__.r(__webpack_exports__);\n/* harmony export */ __webpack_require__.d(__webpack_exports__, {\n/* harmony export */   \"default\": function() { return /* binding */ Incluir; }\n/* harmony export */ });\n/* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! react/jsx-dev-runtime */ \"(app-pages-browser)/./node_modules/next/dist/compiled/react/jsx-dev-runtime.js\");\n/* harmony import */ var next_link__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! next/link */ \"(app-pages-browser)/./node_modules/next/link.js\");\n/* harmony import */ var next_link__WEBPACK_IMPORTED_MODULE_1___default = /*#__PURE__*/__webpack_require__.n(next_link__WEBPACK_IMPORTED_MODULE_1__);\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! react */ \"(app-pages-browser)/./node_modules/next/dist/compiled/react/index.js\");\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_2__);\n/* harmony import */ var _barrel_optimize_names_FaLocationArrow_FaRegTimesCircle_react_icons_fa__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! __barrel_optimize__?names=FaLocationArrow,FaRegTimesCircle!=!react-icons/fa */ \"(app-pages-browser)/./node_modules/react-icons/fa/index.esm.js\");\n/* __next_internal_client_entry_do_not_use__ default auto */ \nvar _s = $RefreshSig$();\n\n\n\nfunction Incluir(param) {\n    let { params } = param;\n    _s();\n    const prodId = params.id == 0 ? \"\" : params.id;\n    const [novo, setNovo] = (0,react__WEBPACK_IMPORTED_MODULE_2__.useState)({\n        titulo: \"\",\n        quantidade: \"\",\n        preco: \"\"\n    });\n    let metodo = \"post\";\n    if (prodId) metodo = \"put\";\n    const handleChange = (e)=>{\n        setNovo({\n            ...novo,\n            [e.target.name]: e.target.value\n        });\n    };\n    const handleSubmit = (e)=>{\n        e.preventDefault();\n        fetch(\"http://localhost:5000/produto/\".concat(prodId), {\n            method: metodo,\n            headers: {\n                \"Content-Type\": \"application/json\"\n            },\n            body: JSON.stringify(novo)\n        }).then(window.location = \"/\").catch((error)=>console.error(error));\n    };\n    (0,react__WEBPACK_IMPORTED_MODULE_2__.useEffect)(()=>{\n        if (prodId) {\n            fetch(\"http://localhost:5000/produto/\".concat(prodId)).then((resp)=>resp.json()).then((resp)=>setNovo(resp)).catch((error)=>console.error(error));\n        }\n    }, [\n        prodId\n    ]);\n    return /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"main\", {\n        className: \"form\",\n        children: [\n            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"h1\", {\n                children: \"Formul\\xe1rio Produtos\"\n            }, void 0, false, {\n                fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                lineNumber: 51,\n                columnNumber: 13\n            }, this),\n            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"form\", {\n                onSubmit: handleSubmit,\n                children: [\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"input\", {\n                        type: \"text\",\n                        name: \"titulo\",\n                        value: novo.titulo,\n                        placeholder: \"T\\xedtulo\",\n                        onChange: handleChange\n                    }, void 0, false, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 54,\n                        columnNumber: 17\n                    }, this),\n                    \" \",\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"br\", {}, void 0, false, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 55,\n                        columnNumber: 65\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"input\", {\n                        type: \"number\",\n                        name: \"quantidade\",\n                        value: novo.quantidade,\n                        placeholder: \"Quantidade\",\n                        onChange: handleChange\n                    }, void 0, false, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 56,\n                        columnNumber: 17\n                    }, this),\n                    \" \",\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"br\", {}, void 0, false, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 57,\n                        columnNumber: 69\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"input\", {\n                        type: \"number\",\n                        name: \"preco\",\n                        value: novo.preco,\n                        placeholder: \"Pre\\xe7o\",\n                        onChange: handleChange,\n                        step: 0.01\n                    }, void 0, false, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 58,\n                        columnNumber: 17\n                    }, this),\n                    \" \",\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"br\", {}, void 0, false, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 59,\n                        columnNumber: 76\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"button\", {\n                        type: \"submit\",\n                        children: [\n                            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(_barrel_optimize_names_FaLocationArrow_FaRegTimesCircle_react_icons_fa__WEBPACK_IMPORTED_MODULE_3__.FaLocationArrow, {}, void 0, false, {\n                                fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                                lineNumber: 60,\n                                columnNumber: 40\n                            }, this),\n                            \"Enviar\"\n                        ]\n                    }, void 0, true, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 60,\n                        columnNumber: 17\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)((next_link__WEBPACK_IMPORTED_MODULE_1___default()), {\n                        href: \"/\",\n                        children: [\n                            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(_barrel_optimize_names_FaLocationArrow_FaRegTimesCircle_react_icons_fa__WEBPACK_IMPORTED_MODULE_3__.FaRegTimesCircle, {}, void 0, false, {\n                                fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                                lineNumber: 61,\n                                columnNumber: 34\n                            }, this),\n                            \"Cancelar\"\n                        ]\n                    }, void 0, true, {\n                        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                        lineNumber: 61,\n                        columnNumber: 17\n                    }, this)\n                ]\n            }, void 0, true, {\n                fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n                lineNumber: 53,\n                columnNumber: 13\n            }, this)\n        ]\n    }, void 0, true, {\n        fileName: \"C:\\\\Users\\\\Breno\\\\gitClones\\\\FIAP\\\\FIAP\\\\RWD\\\\aula6-11\\\\next-crud-1tdspk\\\\src\\\\app\\\\incluir\\\\[id]\\\\page.jsx\",\n        lineNumber: 50,\n        columnNumber: 9\n    }, this);\n}\n_s(Incluir, \"lYAD7K+ydk4LudfteMn0P4eaceg=\");\n_c = Incluir;\nvar _c;\n$RefreshReg$(_c, \"Incluir\");\n\n\n;\n    // Wrapped in an IIFE to avoid polluting the global scope\n    ;\n    (function () {\n        var _a, _b;\n        // Legacy CSS implementations will `eval` browser code in a Node.js context\n        // to extract CSS. For backwards compatibility, we need to check we're in a\n        // browser context before continuing.\n        if (typeof self !== 'undefined' &&\n            // AMP / No-JS mode does not inject these helpers:\n            '$RefreshHelpers$' in self) {\n            // @ts-ignore __webpack_module__ is global\n            var currentExports = module.exports;\n            // @ts-ignore __webpack_module__ is global\n            var prevSignature = (_b = (_a = module.hot.data) === null || _a === void 0 ? void 0 : _a.prevSignature) !== null && _b !== void 0 ? _b : null;\n            // This cannot happen in MainTemplate because the exports mismatch between\n            // templating and execution.\n            self.$RefreshHelpers$.registerExportsForReactRefresh(currentExports, module.id);\n            // A module can be accepted automatically based on its exports, e.g. when\n            // it is a Refresh Boundary.\n            if (self.$RefreshHelpers$.isReactRefreshBoundary(currentExports)) {\n                // Save the previous exports signature on update so we can compare the boundary\n                // signatures. We avoid saving exports themselves since it causes memory leaks (https://github.com/vercel/next.js/pull/53797)\n                module.hot.dispose(function (data) {\n                    data.prevSignature =\n                        self.$RefreshHelpers$.getRefreshBoundarySignature(currentExports);\n                });\n                // Unconditionally accept an update to this module, we'll check if it's\n                // still a Refresh Boundary later.\n                // @ts-ignore importMeta is replaced in the loader\n                module.hot.accept();\n                // This field is set when the previous version of this module was a\n                // Refresh Boundary, letting us know we need to check for invalidation or\n                // enqueue an update.\n                if (prevSignature !== null) {\n                    // A boundary can become ineligible if its exports are incompatible\n                    // with the previous exports.\n                    //\n                    // For example, if you add/remove/change exports, we'll want to\n                    // re-execute the importing modules, and force those components to\n                    // re-render. Similarly, if you convert a class component to a\n                    // function, we want to invalidate the boundary.\n                    if (self.$RefreshHelpers$.shouldInvalidateReactRefreshBoundary(prevSignature, self.$RefreshHelpers$.getRefreshBoundarySignature(currentExports))) {\n                        module.hot.invalidate();\n                    }\n                    else {\n                        self.$RefreshHelpers$.scheduleUpdate();\n                    }\n                }\n            }\n            else {\n                // Since we just executed the code for the module, it's possible that the\n                // new exports made it ineligible for being a boundary.\n                // We only care about the case when we were _previously_ a boundary,\n                // because we already accepted this update (accidental side effect).\n                var isNoLongerABoundary = prevSignature !== null;\n                if (isNoLongerABoundary) {\n                    module.hot.invalidate();\n                }\n            }\n        }\n    })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiKGFwcC1wYWdlcy1icm93c2VyKS8uL3NyYy9hcHAvaW5jbHVpci9baWRdL3BhZ2UuanN4IiwibWFwcGluZ3MiOiI7Ozs7Ozs7Ozs7OztBQUU0QjtBQUNlO0FBQ3VCO0FBR25ELFNBQVNLLFFBQVEsS0FBUTtRQUFSLEVBQUNDLE1BQU0sRUFBQyxHQUFSOztJQUU1QixNQUFNQyxTQUFTRCxPQUFPRSxFQUFFLElBQUksSUFBSSxLQUFLRixPQUFPRSxFQUFFO0lBRTlDLE1BQU0sQ0FBQ0MsTUFBTUMsUUFBUSxHQUFHUiwrQ0FBUUEsQ0FBQztRQUM3QlMsUUFBTztRQUNQQyxZQUFXO1FBQ1hDLE9BQU07SUFDVjtJQUVBLElBQUlDLFNBQVM7SUFDYixJQUFHUCxRQUFRTyxTQUFTO0lBRXBCLE1BQU1DLGVBQWVDLENBQUFBO1FBQ2pCTixRQUFRO1lBQUMsR0FBR0QsSUFBSTtZQUFFLENBQUNPLEVBQUVDLE1BQU0sQ0FBQ0MsSUFBSSxDQUFDLEVBQUNGLEVBQUVDLE1BQU0sQ0FBQ0UsS0FBSztRQUFBO0lBQ3BEO0lBRUEsTUFBTUMsZUFBZUosQ0FBQUE7UUFDakJBLEVBQUVLLGNBQWM7UUFDaEJDLE1BQU0saUNBQXdDLE9BQVBmLFNBQVM7WUFDaERnQixRQUFRVDtZQUNSVSxTQUFRO2dCQUFDLGdCQUFlO1lBQWtCO1lBQzFDQyxNQUFNQyxLQUFLQyxTQUFTLENBQUNsQjtRQUN2QixHQUNDbUIsSUFBSSxDQUFDQyxPQUFPQyxRQUFRLEdBQUcsS0FDdkJDLEtBQUssQ0FBQ0MsQ0FBQUEsUUFBU0MsUUFBUUQsS0FBSyxDQUFDQTtJQUNoQztJQUVBL0IsZ0RBQVNBLENBQUM7UUFDTixJQUFHTSxRQUFPO1lBQ05lLE1BQU0saUNBQXdDLE9BQVBmLFNBQ3RDcUIsSUFBSSxDQUFDTSxDQUFBQSxPQUFRQSxLQUFLQyxJQUFJLElBQ3RCUCxJQUFJLENBQUNNLENBQUFBLE9BQVF4QixRQUFRd0IsT0FDckJILEtBQUssQ0FBQ0MsQ0FBQUEsUUFBU0MsUUFBUUQsS0FBSyxDQUFDQTtRQUNsQztJQUNKLEdBQUU7UUFBQ3pCO0tBQU87SUFNVixxQkFDSSw4REFBQzZCO1FBQUtDLFdBQVU7OzBCQUNaLDhEQUFDQzswQkFBRzs7Ozs7OzBCQUVKLDhEQUFDQztnQkFBS0MsVUFBVXBCOztrQ0FDWiw4REFBQ3FCO3dCQUFNQyxNQUFLO3dCQUFPeEIsTUFBSzt3QkFBU0MsT0FBT1YsS0FBS0UsTUFBTTt3QkFDbkRnQyxhQUFZO3dCQUFTQyxVQUFVN0I7Ozs7OztvQkFBZ0I7a0NBQUMsOERBQUM4Qjs7Ozs7a0NBQ2pELDhEQUFDSjt3QkFBTUMsTUFBSzt3QkFBU3hCLE1BQUs7d0JBQWFDLE9BQU9WLEtBQUtHLFVBQVU7d0JBQzdEK0IsYUFBWTt3QkFBYUMsVUFBVTdCOzs7Ozs7b0JBQWdCO2tDQUFDLDhEQUFDOEI7Ozs7O2tDQUNyRCw4REFBQ0o7d0JBQU1DLE1BQUs7d0JBQVN4QixNQUFLO3dCQUFRQyxPQUFPVixLQUFLSSxLQUFLO3dCQUNuRDhCLGFBQVk7d0JBQVFDLFVBQVU3Qjt3QkFBYytCLE1BQU07Ozs7OztvQkFBUTtrQ0FBQyw4REFBQ0Q7Ozs7O2tDQUM1RCw4REFBQ0U7d0JBQU9MLE1BQUs7OzBDQUFVLDhEQUFDdkMsbUhBQWVBOzs7Ozs0QkFBRTs7Ozs7OztrQ0FDekMsOERBQUNILGtEQUFJQTt3QkFBQ2dELE1BQU07OzBDQUFLLDhEQUFDNUMsb0hBQWdCQTs7Ozs7NEJBQUU7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7QUFLcEQ7R0ExRHdCQztLQUFBQSIsInNvdXJjZXMiOlsid2VicGFjazovL19OX0UvLi9zcmMvYXBwL2luY2x1aXIvW2lkXS9wYWdlLmpzeD9jMzEzIl0sInNvdXJjZXNDb250ZW50IjpbIlwidXNlIGNsaWVudFwiXHJcblxyXG5pbXBvcnQgTGluayBmcm9tIFwibmV4dC9saW5rXCJcclxuaW1wb3J0IHsgdXNlRWZmZWN0LCB1c2VTdGF0ZSB9IGZyb20gXCJyZWFjdFwiXHJcbmltcG9ydCB7IEZhTG9jYXRpb25BcnJvdywgRmFSZWdUaW1lc0NpcmNsZSB9IGZyb20gJ3JlYWN0LWljb25zL2ZhJ1xyXG5cclxuXHJcbmV4cG9ydCBkZWZhdWx0IGZ1bmN0aW9uIEluY2x1aXIoe3BhcmFtc30pe1xyXG5cclxuICAgIGNvbnN0IHByb2RJZCA9IHBhcmFtcy5pZCA9PSAwID8gJycgOiBwYXJhbXMuaWRcclxuXHJcbiAgICBjb25zdCBbbm92bywgc2V0Tm92b10gPSB1c2VTdGF0ZSh7XHJcbiAgICAgICAgdGl0dWxvOicnLFxyXG4gICAgICAgIHF1YW50aWRhZGU6JycsXHJcbiAgICAgICAgcHJlY286JydcclxuICAgIH0pXHJcblxyXG4gICAgbGV0IG1ldG9kbyA9ICdwb3N0J1xyXG4gICAgaWYocHJvZElkKSBtZXRvZG8gPSAncHV0J1xyXG5cclxuICAgIGNvbnN0IGhhbmRsZUNoYW5nZSA9IGUgPT4ge1xyXG4gICAgICAgIHNldE5vdm8oey4uLm5vdm8sIFtlLnRhcmdldC5uYW1lXTplLnRhcmdldC52YWx1ZX0pXHJcbiAgICB9XHJcblxyXG4gICAgY29uc3QgaGFuZGxlU3VibWl0ID0gZSA9PntcclxuICAgICAgICBlLnByZXZlbnREZWZhdWx0KClcclxuICAgICAgICBmZXRjaChgaHR0cDovL2xvY2FsaG9zdDo1MDAwL3Byb2R1dG8vJHtwcm9kSWR9YCx7XHJcbiAgICAgICAgbWV0aG9kOiBtZXRvZG8sXHJcbiAgICAgICAgaGVhZGVyczp7XCJDb250ZW50LVR5cGVcIjpcImFwcGxpY2F0aW9uL2pzb25cIn0sXHJcbiAgICAgICAgYm9keTogSlNPTi5zdHJpbmdpZnkobm92bylcclxuICAgICAgfSlcclxuICAgICAgLnRoZW4od2luZG93LmxvY2F0aW9uID0gJy8nKVxyXG4gICAgICAuY2F0Y2goZXJyb3IgPT4gY29uc29sZS5lcnJvcihlcnJvcikpICAgIFxyXG4gICAgfVxyXG5cclxuICAgIHVzZUVmZmVjdCgoKT0+e1xyXG4gICAgICAgIGlmKHByb2RJZCl7XHJcbiAgICAgICAgICAgIGZldGNoKGBodHRwOi8vbG9jYWxob3N0OjUwMDAvcHJvZHV0by8ke3Byb2RJZH1gKVxyXG4gICAgICAgICAgICAudGhlbihyZXNwID0+IHJlc3AuanNvbigpKVxyXG4gICAgICAgICAgICAudGhlbihyZXNwID0+IHNldE5vdm8ocmVzcCkpXHJcbiAgICAgICAgICAgIC5jYXRjaChlcnJvciA9PiBjb25zb2xlLmVycm9yKGVycm9yKSkgICAgIFxyXG4gICAgICAgIH1cclxuICAgIH0sW3Byb2RJZF0pXHJcblxyXG5cclxuXHJcblxyXG5cclxuICAgIHJldHVybihcclxuICAgICAgICA8bWFpbiBjbGFzc05hbWU9XCJmb3JtXCI+XHJcbiAgICAgICAgICAgIDxoMT5Gb3JtdWzDoXJpbyBQcm9kdXRvczwvaDE+XHJcblxyXG4gICAgICAgICAgICA8Zm9ybSBvblN1Ym1pdD17aGFuZGxlU3VibWl0fT5cclxuICAgICAgICAgICAgICAgIDxpbnB1dCB0eXBlPVwidGV4dFwiIG5hbWU9J3RpdHVsbycgdmFsdWU9e25vdm8udGl0dWxvfVxyXG4gICAgICAgICAgICAgICAgcGxhY2Vob2xkZXI9XCJUw610dWxvXCIgb25DaGFuZ2U9e2hhbmRsZUNoYW5nZX0gLz4gPGJyIC8+XHJcbiAgICAgICAgICAgICAgICA8aW5wdXQgdHlwZT1cIm51bWJlclwiIG5hbWU9J3F1YW50aWRhZGUnIHZhbHVlPXtub3ZvLnF1YW50aWRhZGV9XHJcbiAgICAgICAgICAgICAgICBwbGFjZWhvbGRlcj1cIlF1YW50aWRhZGVcIiBvbkNoYW5nZT17aGFuZGxlQ2hhbmdlfSAvPiA8YnIgLz5cclxuICAgICAgICAgICAgICAgIDxpbnB1dCB0eXBlPVwibnVtYmVyXCIgbmFtZT0ncHJlY28nIHZhbHVlPXtub3ZvLnByZWNvfVxyXG4gICAgICAgICAgICAgICAgcGxhY2Vob2xkZXI9XCJQcmXDp29cIiBvbkNoYW5nZT17aGFuZGxlQ2hhbmdlfSBzdGVwPXswLjAxfSAvPiA8YnIgLz5cclxuICAgICAgICAgICAgICAgIDxidXR0b24gdHlwZT1cInN1Ym1pdFwiID48RmFMb2NhdGlvbkFycm93Lz5FbnZpYXI8L2J1dHRvbj5cclxuICAgICAgICAgICAgICAgIDxMaW5rIGhyZWY9eycvJ30+PEZhUmVnVGltZXNDaXJjbGUvPkNhbmNlbGFyPC9MaW5rPlxyXG5cclxuICAgICAgICAgICAgPC9mb3JtPlxyXG4gICAgICAgIDwvbWFpbj5cclxuICAgIClcclxufSJdLCJuYW1lcyI6WyJMaW5rIiwidXNlRWZmZWN0IiwidXNlU3RhdGUiLCJGYUxvY2F0aW9uQXJyb3ciLCJGYVJlZ1RpbWVzQ2lyY2xlIiwiSW5jbHVpciIsInBhcmFtcyIsInByb2RJZCIsImlkIiwibm92byIsInNldE5vdm8iLCJ0aXR1bG8iLCJxdWFudGlkYWRlIiwicHJlY28iLCJtZXRvZG8iLCJoYW5kbGVDaGFuZ2UiLCJlIiwidGFyZ2V0IiwibmFtZSIsInZhbHVlIiwiaGFuZGxlU3VibWl0IiwicHJldmVudERlZmF1bHQiLCJmZXRjaCIsIm1ldGhvZCIsImhlYWRlcnMiLCJib2R5IiwiSlNPTiIsInN0cmluZ2lmeSIsInRoZW4iLCJ3aW5kb3ciLCJsb2NhdGlvbiIsImNhdGNoIiwiZXJyb3IiLCJjb25zb2xlIiwicmVzcCIsImpzb24iLCJtYWluIiwiY2xhc3NOYW1lIiwiaDEiLCJmb3JtIiwib25TdWJtaXQiLCJpbnB1dCIsInR5cGUiLCJwbGFjZWhvbGRlciIsIm9uQ2hhbmdlIiwiYnIiLCJzdGVwIiwiYnV0dG9uIiwiaHJlZiJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///(app-pages-browser)/./src/app/incluir/[id]/page.jsx\n"));

/***/ })

});