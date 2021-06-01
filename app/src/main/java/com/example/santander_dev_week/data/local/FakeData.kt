package com.example.santander_dev_week.data.local

import com.example.santander_dev_week.data.Cartao
import com.example.santander_dev_week.data.Cliente
import com.example.santander_dev_week.data.Conta


class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente(nome = "Naom Nunes")
        val cartao = Cartao(numeroCartao = "4200115547")

        return Conta(
            numero = "756542-9", agencia = "4568-8", saldo = "R$ 5.400,60", limite = "R$ 10645,25",
            cliente = cliente,
            cartao = cartao
        );
    }
}