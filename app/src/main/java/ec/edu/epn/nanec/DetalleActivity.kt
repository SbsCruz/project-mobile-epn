
package ec.edu.epn.nanec

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme

import androidx.compose.ui.Modifier

import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp

class DetalleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /* Obtenemos el nombre del lugar desde el Intent */
            val nombreLugar = intent.getStringExtra("nombreLugar") ?: "Lugar desconocido"
//            MostrarDetalleLugar(nombreLugar)
//            MostrarDescripcionLugar(nombreLugar)
            FilledCardExample(nombreLugar)
        }
    }
}

@Composable
fun FilledCardExample(nombreLugar: String) {
  Card(
    colors = CardDefaults.cardColors(
      containerColor = MaterialTheme.colorScheme.onSecondary,
    ),
    modifier = Modifier
      .size(width = 200.dp, height = 100.dp)
  ) {
    Text(
      text = "\n$nombreLugar",
      modifier = Modifier
        .padding(16.dp),
      textAlign = TextAlign.Center,
    )
  }
}

@Composable
fun MostrarDetalleLugar(nombreLugar: String) {
    Text(text = "Detalles del lugar: $nombreLugar")
}

@Composable
fun MostrarDescripcionLugar(nombreLugar: String) {
    Text(text = "\n$nombreLugar es un lugar para toda la familia, si vas con mascotas lleva una funda")
}

@Preview(showBackground = true)
@Composable
fun PreviewDetalle() {
    FilledCardExample("Mirador de San José")
}

