package com.example.dicodingproject1

object GameObject {

    private val listObject = mutableListOf<Game>()
    val data : List<Game>
        get(){
            generateObject()
            return listObject
        }

    private fun generateObject(){
        listObject.apply {
            add(Game("Dota2","MOBA","Merupakan game paling hebat yang pernah kumainkan", photo = R.drawable.dota2))
            add(Game("League of Legend","MOBA","Game yang dulu asik untuk dimainkan", photo = R.drawable.lol))
            add(Game("Genshin Impact","Open World","Merupakan game berbasis Open World yang seru untuk dimainkan",R.drawable.genshin))
            add(Game("Call of Duty", "FPS", "Game tembak tembakan seru untuk kalian yang suka tembak tembakan!", R.drawable.cod))
            add(Game("Valorant","FPS","Game yang seru, dan juga terdapat skill yang bisa kalian gunakan!", R.drawable.valorant))
            add(Game("Tetris","Puzzle","Rasakan keseruannya untuk mendapat blok yang sempurna!",R.drawable.tetr))
            add(Game("Mobile Legends","MOBA","Game yang paling asik dimainkan bersama teman, tapi tidak untuk dimainkan sendiri!", R.drawable.mobilewijen))
            add(Game("PUBG","Battle Royale","Jadilah seseorang yang berhasil bertahan hidup!", R.drawable.pubg))
            add(Game("Phasmophobia","Horror","Merasa dirimu pemberani? coba main game ini sendirian!",R.drawable.phasmo))
            add(Game("Devour","Horror","Jangan mainkan game ini kalau kamu punya penyakit jantung!",R.drawable.devour))
        }
    }

    // test with map

    private val list = mutableListOf<Map<String,String>>()
    private fun maptemp(name : String, genre : String, deskripsi : String ) : Unit{
        val map = mapOf<String,String>(
            "name" to name,
            "genre" to genre,
            "deskripsi" to deskripsi
        )
        list.add(map)
    }



    private fun generateMap(){
        maptemp("Dota2", "MOBA","Merupakan game paling hebat yang pernah kumainkan")
        maptemp("League of Legend","MOBA","Game yang dulu asik untuk dimainkan")
        maptemp("Genshin Impact","Open World","Merupakan game berbasis Open World yang seru untuk dimainkan")
        maptemp("Call of Duty", "FPS", "Game tembak tembakan seru untuk kalian yang suka tembak tembakan!")
        maptemp("Valorant","FPS","Game yang seru, dan juga terdapat skill yang bisa kalian gunakan!")
        maptemp("Tetris","Puzzle","Rasakan keseruannya untuk mendapat blok yang sempurna!")
        maptemp("Mobile Legends","MOBA","Game yang paling asik dimainkan bersama teman, tapi tidak untuk dimainkan sendiri!")
        maptemp("PUBG","Battle Royale","Jadilah seseorang yang berhasil bertahan hidup!")
        maptemp("Phasmophobia","Horror","Merasa dirimu pemberani? coba main game ini sendirian!")
        maptemp("Devour","Horror","Jangan mainkan game ini kalau kamu punya penyakit jantung!")
    }

//    val data : List<Game>
//        get(){
//            generateMap()
//            val data = mutableListOf<Game>()
//            list.forEach{
//                data.add(Game(it["name"].toString(), it["genre"].toString(),it["deskripsi"].toString()))
//            }
//            return data
//        }


}