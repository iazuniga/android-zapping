# android-zapping
Ejemplo Zapping entre "ventanas" b谩sico, Android con Kotlin. Modificado con fines did谩cticos. Original: https://youtu.be/j4j_jN-Bp7U y https://youtu.be/Ql2JlSQJD28
> UI compuesta de 2 activity, entre las cuales se puede ir de una o la otra y viseversa, pasando informaci贸n (nombre) de una aotra. 馃摫 


## Nota:
* En MainActivity.kt, se muestra el c贸digo principal para la interacci贸n y recuperaci贸n de la informaci贸n intercambiada entre las 2 activity: 
```
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", cName.text)
            startActivity(intent)
            ...
            Toast.makeText(this, "El Nombre no puede ser vacio", Toast.LENGTH_LONG).show()
```

* En ResultActivity.kt, se muestra el c贸digo principal para "ir atras" entre las activity y recuperaci贸n de la informaci贸n intercambiada entre las 2 activity: 
```
        val btnBack:Button=findViewById(R.id.btnBack)
        btnBack.setOnClickListener { onBackPressed() }
        ...
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        //tvGreeting.text = "Hi $name"
        val tvGreeting: TextView =findViewById(R.id.tvGreeting)
        tvGreeting.text = "Hi $name"
```
