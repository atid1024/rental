
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerManager from "./components/CustomerManager"

import PayManager from "./components/PayManager"

import InvetoryManagementManager from "./components/InvetoryManagementManager"

import Dashboard from "./components/Dashboard"
import RentManager from "./components/RentManager"

import SearchBook from "./components/SearchBook"
export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },

            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },

            {
                path: '/invetoryManagements',
                name: 'InvetoryManagementManager',
                component: InvetoryManagementManager
            },

            {
                path: '/dashboards',
                name: 'Dashboard',
                component: Dashboard
            },
            {
                path: '/rents',
                name: 'RentManager',
                component: RentManager
            },

            {
                path: '/searchBooks',
                name: 'SearchBook',
                component: SearchBook
            },


    ]
})
