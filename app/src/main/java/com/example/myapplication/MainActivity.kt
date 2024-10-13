package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter: ArticleAdapter = ArticleAdapter(getArticles())
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)

    }

    fun getArticles(): List<Article> {
        val articles=ArrayList<Article>()
        articles.add(Article(
            title = "Islamabad: The Green and Peaceful Capital",
            author = "By Urban Explorer",
            image = R.drawable.f20,
            details = "Islamabad, Pakistan’s capital, is known for its green landscapes and peaceful ambiance. Nestled against the backdrop of the Margalla Hills, it offers a perfect balance between nature and urban life. Visit Daman-e-Koh for panoramic views of the city, or explore the iconic Faisal Mosque, one of the largest mosques in the world. Take a stroll in the serene Fatima Jinnah Park, or hike the trails of Pir Sohawa for a closer connection with nature. Islamabad’s clean, well-planned layout and its rich fusion of culture and modernity make it one of South Asia's most livable cities."
        ))

        articles.add(Article(
            title = "Murree: The Queen of Hills",
            author = "By Mountain Lover",
            image = R.drawable.f2,
            details = "Murree, known as the 'Queen of Hills,' is a popular hill station located just a short drive from Islamabad. With its cool climate, dense pine forests, and picturesque valleys, it has been a favored retreat since colonial times. The Mall Road, lined with quaint shops and eateries, is perfect for an evening stroll. Don’t miss the scenic chairlift ride to Patriata, where you can soak in the breathtaking views of the surrounding mountains. In winter, Murree transforms into a snowy wonderland, ideal for visitors seeking a cozy and serene escape."
        ))

        articles.add(Article(
            title = "Gwadar: The Jewel of Balochistan",
            author = "By Coastal Adventurer",
            image = R.drawable.f15,
            details = "Gwadar, located on Pakistan’s southwestern coast, is often referred to as the Jewel of Balochistan. Famous for its pristine beaches, turquoise waters, and rugged landscapes, Gwadar is quickly becoming a hotspot for adventure seekers. From the unique formation of the Hammerhead to the crystal-clear waters of the Arabian Sea, this coastal city offers a mix of natural beauty and emerging economic importance due to its deep-sea port. For those seeking off-the-beaten-path experiences, a visit to the Martian-like landscapes of the Hingol National Park is a must."
        ))

        articles.add(Article(
            title = "Swat Valley: The Switzerland of Pakistan",
            author = "By Travel Writer",
            image = R.drawable.f4,
            details = "Swat Valley, often called the 'Switzerland of Pakistan,' is a region of breathtaking beauty with snow-capped mountains, lush green valleys, and crystal-clear rivers. The city of Mingora serves as a gateway to the valley, but the real treasures lie in its natural landscapes and cultural sites. Don’t miss a visit to Malam Jabba, Pakistan's only ski resort, or take a trek through the verdant Utror and Kalam valleys. Swat’s rich history, from its ancient Buddhist heritage to its more recent Pashtun culture, makes it a place of historical significance as well as natural beauty."
        ))

        articles.add(Article(
            title = "Lahore: The City of Gardens and History",
            author = "By History Buff",
            image = R.drawable.f5,
            details = "Lahore, the heart of Pakistan, is renowned for its vibrant culture, historical architecture, and lively spirit. From the grandeur of the Lahore Fort and Badshahi Mosque to the intricate Shalimar Gardens, this city breathes history. Walk down the streets of the Walled City to explore old havelis, bazaars, and shrines. For food lovers, Lahore offers some of the best culinary experiences in Pakistan, with its famous Food Street offering mouthwatering traditional dishes. The city's parks, such as Bagh-e-Jinnah, provide lush green spaces amidst the urban sprawl."
        ))

        articles.add(Article(
            title = "Chitral: A Hidden Gem in the Hindu Kush",
            author = "By Off-the-Beaten-Path Explorer",
            image = R.drawable.f6,
            details = "Chitral, nestled deep in the Hindu Kush mountains, is a destination for those looking to explore Pakistan's untouched wilderness. The valley is known for its stunning scenery and rich cultural heritage, particularly the Kalash people, who live in three remote valleys. Their unique customs, festivals, and colorful attire make for an unforgettable cultural experience. Chitral is also a haven for adventure seekers, offering trekking, mountaineering, and river rafting opportunities. The annual Shandur Polo Festival, held at the world’s highest polo ground, is a major attraction for both locals and tourists."
        ))

        articles.add(Article(
            title = "Karachi: The City of Lights and the Sea",
            author = "By Urban Wanderer",
            image = R.drawable.f17,
            details = "Karachi, Pakistan’s largest and most populous city, is a vibrant metropolis that offers a mix of modernity, culture, and history. Located along the Arabian Sea, it boasts beautiful beaches like Clifton and Hawke's Bay, ideal for sunset views and leisure activities. Karachi is also home to significant historical landmarks such as the Quaid-e-Azam's Mausoleum and Mohatta Palace. The city's bustling markets, from Saddar to Tariq Road, offer a rich shopping experience, while its culinary scene, especially the street food culture, is one of the best in the country."
        ))

        articles.add(Article(
            title = "Hunza Valley: Paradise on Earth",
            author = "By Nature Enthusiast",
            image = R.drawable.f18,
            details = "Hunza Valley, located in the Gilgit-Baltistan region, is often described as a paradise on Earth. Surrounded by towering peaks like Rakaposhi and Ultar Sar, the valley offers stunning views and a peaceful atmosphere. The terraced fields and fruit orchards make Hunza particularly beautiful during spring and autumn. Karimabad, the main town, is a great base for exploring the Baltit and Altit forts, which offer insights into the region's history. Hunza is also a great destination for trekkers, with many trails offering panoramic views of the surrounding glaciers and peaks."
        ))

        articles.add(Article(
            title = "Fairy Meadows: Gateway to Nanga Parbat",
            author = "By Adventure Seeker",
            image = R.drawable.f9,
            details = "Fairy Meadows is a magical destination located at the base of Nanga Parbat, the world's ninth-highest mountain. Known for its breathtaking scenery, it is a favorite among trekkers and photographers. The lush meadows, surrounded by dense pine forests and towering peaks, offer a tranquil retreat. From here, you can embark on treks to Nanga Parbat’s base camp for a closer view of the majestic mountain. The journey to Fairy Meadows itself is an adventure, with a thrilling jeep ride followed by a short hike through the mountains."
        ))

        articles.add(Article(
            title = "Skardu: Land of Mountains and Lakes",
            author = "By High Altitude Explorer",
            image = R.drawable.f10,
            details = "Skardu, located in the Gilgit-Baltistan region, is the gateway to some of the world's highest peaks, including K2. The stunning landscapes of Skardu include shimmering lakes like Shangrila and Satpara, which reflect the surrounding snow-capped mountains. For history enthusiasts, the Skardu Fort offers a glimpse into the region's past. Nearby, Deosai National Park, known as the 'Land of Giants,' is a high-altitude plateau that comes alive with wildflowers in the summer. Skardu is a must-visit for mountaineers, trekkers, and nature lovers alike."
        ))
        articles.add(Article(
            title = "Islamabad: The Green and Peaceful Capital",
            author = "By Urban Explorer",
            image = R.drawable.f11,
            details = "Islamabad, Pakistan’s capital, is known for its green landscapes and peaceful ambiance. Nestled against the backdrop of the Margalla Hills, it offers a perfect balance between nature and urban life. Visit Daman-e-Koh for panoramic views of the city, or explore the iconic Faisal Mosque, one of the largest mosques in the world. Take a stroll in the serene Fatima Jinnah Park, or hike the trails of Pir Sohawa for a closer connection with nature. Islamabad’s clean, well-planned layout and its rich fusion of culture and modernity make it one of South Asia's most livable cities."
        ))

        articles.add(Article(
            title = "Murree: The Queen of Hills",
            author = "By Mountain Lover",
            image = R.drawable.f12,
            details = "Murree, known as the 'Queen of Hills,' is a popular hill station located just a short drive from Islamabad. With its cool climate, dense pine forests, and picturesque valleys, it has been a favored retreat since colonial times. The Mall Road, lined with quaint shops and eateries, is perfect for an evening stroll. Don’t miss the scenic chairlift ride to Patriata, where you can soak in the breathtaking views of the surrounding mountains. In winter, Murree transforms into a snowy wonderland, ideal for visitors seeking a cozy and serene escape."
        ))























        return articles
    }
}