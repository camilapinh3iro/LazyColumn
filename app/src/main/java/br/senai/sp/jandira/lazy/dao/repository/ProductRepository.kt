package br.senai.sp.jandira.lazy.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazy.R
import br.senai.sp.jandira.lazy.model.Product

class ProductRepository {
    companion object {

        @Composable
        fun getProductsList(): List<Product> {
            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Feijó",
                    description = "Mickey Mouse é um personagem de desenho animado e que se tornou o símbolo da Walt Disney Company. O personagem foi criado em 1928 por Walt Disney e o desenhista Ub Iwerks e dublado por Walt Disney",
                    price = 124.99,
                    image = painterResource(id = R.drawable.mickey)
                ),
                Product(id = 2, name = "Xuxa", image = painterResource(id = R.drawable.xuxa), description = "Maria da Graça Xuxa Meneghel, mais conhecida como Xuxa, é uma apresentadora, atriz, cantora, empresária, filantropa e ex-modelo brasileira. Conhecida como \"Rainha dos Baixinhos\", Xuxa construiu o maior império de entretenimento infanto-juvenil ibero-americano. "),
                Product(id = 3, name = "Monitor", price = 897.99),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
            )
        }
    }
}