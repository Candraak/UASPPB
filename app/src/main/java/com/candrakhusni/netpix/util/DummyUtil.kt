package com.candrakhusni.netpix.util

import com.candrakhusni.netpix.data.Movies
import com.google.gson.Gson

object DummyUtil {
    fun list(): Movies {
        val dummyData = """{
  "page": 1,
  "results": [
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/1Rr5SrvHxMXHu5RjKpaMba8VTzi.jpg",
      "genre_ids": [
        28,
        12,
        878
      ],
      "id": 634649,
      "original_language": "en",
      "original_title": "Spider-Man: No Way Home",
      "overview": "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
      "popularity": 11305.326,
      "poster_path": "https://image.tmdb.org/t/p/w500/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
      "release_date": "2021-12-15",
      "title": "Spider-Man: No Way Home",
      "video": false,
      "vote_average": 8.4,
      "vote_count": 3265
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/3G1Q5xF40HkUBJXxt2DQgQzKTp5.jpg",
      "genre_ids": [
        16,
        35,
        10751,
        14
      ],
      "id": 568124,
      "original_language": "en",
      "original_title": "Encanto",
      "overview": "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
      "popularity": 9255.534,
      "poster_path": "https://image.tmdb.org/t/p/w500/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
      "release_date": "2021-11-24",
      "title": "Encanto",
      "video": false,
      "vote_average": 7.8,
      "vote_count": 1671
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/o76ZDm8PS9791XiuieNB93UZcRV.jpg",
      "genre_ids": [
        27,
        28,
        878
      ],
      "id": 460458,
      "original_language": "en",
      "original_title": "Resident Evil: Welcome to Raccoon City",
      "overview": "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
      "popularity": 10489.604,
      "poster_path": "https://image.tmdb.org/t/p/w500/6WR7wLCX0PGLhj51qyvK8MIxtT5.jpg",
      "release_date": "2021-11-24",
      "title": "Resident Evil: Welcome to Raccoon City",
      "video": false,
      "vote_average": 6.1,
      "vote_count": 611
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/hv7o3VgfsairBoQFAawgaQ4cR1m.jpg",
      "genre_ids": [
        28,
        878
      ],
      "id": 624860,
      "original_language": "en",
      "original_title": "The Matrix Resurrections",
      "overview": "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
      "popularity": 9707.765,
      "poster_path": "https://image.tmdb.org/t/p/w500/8c4a8kE7PizaGQQnditMmI1xbRp.jpg",
      "release_date": "2021-12-16",
      "title": "The Matrix Resurrections",
      "video": false,
      "vote_average": 7.1,
      "vote_count": 1498
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/vIgyYkXkg6NC2whRbYjBD7eb3Er.jpg",
      "genre_ids": [
        878,
        28,
        12
      ],
      "id": 580489,
      "original_language": "en",
      "original_title": "Venom: Let There Be Carnage",
      "overview": "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
      "popularity": 6667.173,
      "poster_path": "https://image.tmdb.org/t/p/w500/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
      "release_date": "2021-09-30",
      "title": "Venom: Let There Be Carnage",
      "video": false,
      "vote_average": 7.2,
      "vote_count": 5436
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/dK12GIdhGP6NPGFssK2Fh265jyr.jpg",
      "genre_ids": [
        28,
        35,
        80,
        53
      ],
      "id": 512195,
      "original_language": "en",
      "original_title": "Red Notice",
      "overview": "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
      "popularity": 3816.119,
      "poster_path": "https://image.tmdb.org/t/p/w500/lAXONuqg41NwUMuzMiFvicDET9Y.jpg",
      "release_date": "2021-11-04",
      "title": "Red Notice",
      "video": false,
      "vote_average": 6.8,
      "vote_count": 2432
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/cinER0ESG0eJ49kXlExM0MEWGxW.jpg",
      "genre_ids": [
        28,
        12,
        14
      ],
      "id": 566525,
      "original_language": "en",
      "original_title": "Shang-Chi and the Legend of the Ten Rings",
      "overview": "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
      "popularity": 3222.07,
      "poster_path": "https://image.tmdb.org/t/p/w500/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg",
      "release_date": "2021-09-01",
      "title": "Shang-Chi and the Legend of the Ten Rings",
      "video": false,
      "vote_average": 7.8,
      "vote_count": 4814
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/1BqX34aJS5J8PefVnQSfQIEPfkl.jpg",
      "genre_ids": [
        80,
        28,
        53
      ],
      "id": 826749,
      "original_language": "en",
      "original_title": "Fortress",
      "overview": "The story revolves around a top-secret resort for retired U.S. intelligence officers. A group of criminals led by Balzary breach the compound, hellbent on revenge on Robert, forcing the retired officer and his son to save the day.",
      "popularity": 3212.054,
      "poster_path": "https://image.tmdb.org/t/p/w500/m76LAg0MchIcIW9i4yXsQPGQJJF.jpg",
      "release_date": "2021-12-17",
      "title": "Fortress",
      "video": false,
      "vote_average": 6.4,
      "vote_count": 64
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/srFi3oLy8tBcpq07xusnAE5XhwE.jpg",
      "genre_ids": [
        16,
        35,
        10751,
        10402
      ],
      "id": 438695,
      "original_language": "en",
      "original_title": "Sing 2",
      "overview": "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
      "popularity": 2369.882,
      "poster_path": "https://image.tmdb.org/t/p/w500/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
      "release_date": "2021-12-01",
      "title": "Sing 2",
      "video": false,
      "vote_average": 7.5,
      "vote_count": 110
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/nvxrQQspxmSblCYDtvDAbVFX8Jt.jpg",
      "genre_ids": [
        18,
        35,
        878
      ],
      "id": 646380,
      "original_language": "en",
      "original_title": "Don't Look Up",
      "overview": "Two low-level astronomers must go on a giant media tour to warn humankind of an approaching comet that will destroy planet Earth.",
      "popularity": 2669.823,
      "poster_path": "https://image.tmdb.org/t/p/w500/th4E1yqsE8DGpAseLiUrI60Hf8V.jpg",
      "release_date": "2021-12-07",
      "title": "Don't Look Up",
      "video": false,
      "vote_average": 7.3,
      "vote_count": 2405
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/1Wlwnhn5sXUIwlxpJgWszT622PS.jpg",
      "genre_ids": [
        16,
        35,
        10751
      ],
      "id": 585245,
      "original_language": "en",
      "original_title": "Clifford the Big Red Dog",
      "overview": "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
      "popularity": 2091.566,
      "poster_path": "https://image.tmdb.org/t/p/w500/30ULVKdjBcQTsj2aOSThXXZNSxF.jpg",
      "release_date": "2021-11-10",
      "title": "Clifford the Big Red Dog",
      "video": false,
      "vote_average": 7.4,
      "vote_count": 776
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/lyvszvJJqqI8aqBJ70XzdCNoK0y.jpg",
      "genre_ids": [
        28,
        12,
        878
      ],
      "id": 524434,
      "original_language": "en",
      "original_title": "Eternals",
      "overview": "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
      "popularity": 1970.09,
      "poster_path": "https://image.tmdb.org/t/p/w500/6AdXwFTRTAzggD2QUTt5B7JFGKL.jpg",
      "release_date": "2021-11-03",
      "title": "Eternals",
      "video": false,
      "vote_average": 7.1,
      "vote_count": 1569
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/sLWUtbrpiLp23a0XDSiUiltdFPJ.jpg",
      "genre_ids": [
        28,
        12,
        14
      ],
      "id": 1930,
      "original_language": "en",
      "original_title": "The Amazing Spider-Man",
      "overview": "Peter Parker is an outcast high schooler abandoned by his parents as a boy, leaving him to be raised by his Uncle Ben and Aunt May. Like most teenagers, Peter is trying to figure out who he is and how he got to be the person he is today. As Peter discovers a mysterious briefcase that belonged to his father, he begins a quest to understand his parents' disappearance – leading him directly to Oscorp and the lab of Dr. Curt Connors, his father's former partner. As Spider-Man is set on a collision course with Connors' alter ego, The Lizard, Peter will make life-altering choices to use his powers and shape his destiny to become a hero.",
      "popularity": 1981.948,
      "poster_path": "https://image.tmdb.org/t/p/w500/fSbqPbqXa7ePo8bcnZYN9AHv6zA.jpg",
      "release_date": "2012-06-23",
      "title": "The Amazing Spider-Man",
      "video": false,
      "vote_average": 6.6,
      "vote_count": 14103
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/gg2w8QYf6o5elN95RHtikQaVIsc.jpg",
      "genre_ids": [
        28,
        18,
        80
      ],
      "id": 592508,
      "original_language": "hi",
      "original_title": "Sooryavanshi",
      "overview": "A fearless, faithful albeit slightly forgetful Mumbai cop, Veer Sooryavanshi, the chief of the Anti-Terrorism Squad in India pulls out all the stops and stunts to thwart a major conspiracy to attack his city.",
      "popularity": 1940.583,
      "poster_path": "https://image.tmdb.org/t/p/w500/6daLNbfexDUjOpEvIfVaRsjHXJl.jpg",
      "release_date": "2021-11-05",
      "title": "Sooryavanshi",
      "video": false,
      "vote_average": 5.5,
      "vote_count": 52
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/zlj0zHo67xXoj7hvwGtaKRkSdBV.jpg",
      "genre_ids": [
        878,
        53,
        12
      ],
      "id": 728526,
      "original_language": "en",
      "original_title": "Encounter",
      "overview": "A decorated Marine goes on a rescue mission to save his two young sons from an unhuman threat. As their journey takes them in increasingly dangerous directions, the boys will need to leave their childhoods behind.",
      "popularity": 2027.744,
      "poster_path": "https://image.tmdb.org/t/p/w500/tUkY0WxffPZ9PoyC62PIyyUMGnt.jpg",
      "release_date": "2021-12-03",
      "title": "Encounter",
      "video": false,
      "vote_average": 6.3,
      "vote_count": 156
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/tTlAA0REGPXSZPBfWyTW9ipIv1I.jpg",
      "genre_ids": [
        28,
        12,
        878,
        18
      ],
      "id": 315635,
      "original_language": "en",
      "original_title": "Spider-Man: Homecoming",
      "overview": "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.",
      "popularity": 1813.546,
      "poster_path": "https://image.tmdb.org/t/p/w500/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg",
      "release_date": "2017-07-05",
      "title": "Spider-Man: Homecoming",
      "video": false,
      "vote_average": 7.4,
      "vote_count": 17668
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/mFbS5TwN95BcSEfiztdchLgTQ0v.jpg",
      "genre_ids": [
        18,
        36
      ],
      "id": 617653,
      "original_language": "en",
      "original_title": "The Last Duel",
      "overview": "King Charles VI declares that Knight Jean de Carrouges settle his dispute with his squire, Jacques Le Gris, by challenging him to a duel.",
      "popularity": 1954.933,
      "poster_path": "https://image.tmdb.org/t/p/w500/zjrJE0fpzPvX8saJXj8VNfcjBoU.jpg",
      "release_date": "2021-10-13",
      "title": "The Last Duel",
      "video": false,
      "vote_average": 7.6,
      "vote_count": 1238
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/xGrTm3J0FTafmuQ85vF7ZCw94x6.jpg",
      "genre_ids": [
        18,
        36,
        12
      ],
      "id": 589761,
      "original_language": "ru",
      "original_title": "Чернобыль",
      "overview": "The aftermath of a shocking explosion at the Chernobyl nuclear power station made hundreds of people sacrifice their lives to clean up the site of the catastrophe and to successfully prevent an even bigger disaster that could have turned a large part of the European continent into an uninhabitable exclusion zone. This is their story.",
      "popularity": 1898.379,
      "poster_path": "https://image.tmdb.org/t/p/w500/AmJLuHjxPdIJO6vmymeWADG6jK5.jpg",
      "release_date": "2021-04-15",
      "title": "Chernobyl: Abyss",
      "video": false,
      "vote_average": 6.2,
      "vote_count": 247
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/weneJTnAb1IFI94SKcaXzBFmPKH.jpg",
      "genre_ids": [
        80,
        53,
        18,
        28
      ],
      "id": 818192,
      "original_language": "en",
      "original_title": "Ida Red",
      "overview": "Ida Red may not survive her 20-year prison sentence for armed robbery. She turns to her son, Wyatt, for one last job and a chance to regain her freedom.",
      "popularity": 1860.132,
      "poster_path": "https://image.tmdb.org/t/p/w500/etMxKseW67499tUJonLNHXTF538.jpg",
      "release_date": "2021-11-05",
      "title": "Ida Red",
      "video": false,
      "vote_average": 6,
      "vote_count": 13
    },
    {
      "adult": false,
      "backdrop_path": "https://image.tmdb.org/t/p/w500/5B22eed7ErxFiYAG4Ksb4eLwKNF.jpg",
      "genre_ids": [
        16,
        10751,
        12,
        35
      ],
      "id": 770254,
      "original_language": "en",
      "original_title": "Back to the Outback",
      "overview": "Tired of being locked in a reptile house where humans gawk at them like they are monsters, a ragtag group of Australia’s deadliest creatures plot an escape from their zoo to the Outback, a place where they’ll fit in without being judged.",
      "popularity": 1669.526,
      "poster_path": "https://image.tmdb.org/t/p/w500/zNXNRLH5wJprUG6B1olaBTNZOjy.jpg",
      "release_date": "2021-12-03",
      "title": "Back to the Outback",
      "video": false,
      "vote_average": 7.8,
      "vote_count": 184
    }
  ],
  "total_pages": 31781,
  "total_results": 635602
}"""
        val gson = Gson()
        return gson.fromJson(dummyData, Movies::class.java)

    }

}