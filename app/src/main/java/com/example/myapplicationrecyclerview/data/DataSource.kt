package com.example.myapplicationrecyclerview.data

import com.example.myapplicationrecyclerview.models.BlogPost

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    0,
                    "Eddard Ned Stark",
                    "Eddard Ned Stark of House Stark, Lord of Winterfell and Warden of the North, becomes the Hand of the King after Lord Jon Arryn's death. He is known for his sense of honor and justice. He took part in Robert's Rebellion after his sister Lyanna was kidnapped by Crown Prince Rhaegar Targaryen. When Ned's father and brother went south to reclaim her, the Mad King Aerys Targaryen burned both of them alive",
                    "",
                    "",
                    "Abbi Jacobson"
                )
            )
            list.add(
                BlogPost(
                    1,
                    "Robert Baratheon",
                    "Robert Baratheon of House Baratheon, formerly a fierce warrior, became King of the Seven Kingdoms after leading a rebellion against Aerys II Targaryen. He was betrothed to Ned Stark's sister Lyanna and loved her deeply, but she was kidnapped by Rhaegar Targaryen.",
                    "",
                    "",
                    "Danny McBride"
                )
            )

            list.add(
                BlogPost(
                    2,
                    "Jaime Lannister",
                    "Ser Jaime of House Lannister is a member of the Kingsguard and an exceptionally skilled swordsman. He is Cersei Lannister's twin brother and has carried on an incestuous love affair with her all his life, fathering all three of her living children.",
                    "",
                    "",
                    "Maya Rudolph"
                )
            )
            list.add(
                BlogPost(
                    3,
                    "Catelyn Stark",
                    "Catelyn Stark of House Stark and House Tully (née Tully), Lady of Winterfell, is the wife of Lord Eddard Stark. She is also the elder sister of Lysa Arryn, Lady of the Vale and Mistress of the Eyrie, and Lord Edmure Tully, Lord of Riverrun. ",
                    "",
                    "",
                    "Mike Rianda"
                )
            )
            list.add(
                BlogPost(
                    4,
                    "Cersei Lannister",
                    "Cersei Lannister of House Lannister and House Baratheon, Queen of the Seven Kingdoms of Westeros, is the wife of King Robert Baratheon. Cersei has a twin brother, Jaime, with whom she has been involved in an incestuous affair from early childhood.",
                    "",
                    "",
                    "Doug the Pug"
                )
            )
            list.add(
                BlogPost(
                    5,
                    "Daenerys Targaryen ",
                    "She is the exiled princess of the Targaryen dynasty. She and her brother Viserys were smuggled to Essos during the end of Robert's Rebellion. For seventeen years, she has been under her volatile brother's care. In exchange for an army, Viserys marries her to the powerful Dothraki warlord Khal Drogo",
                    "",
                    "",
                    "Olivia Colman"
                )
            )
//
            return list
        }
    }
}