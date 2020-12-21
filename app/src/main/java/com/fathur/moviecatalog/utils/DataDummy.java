package com.fathur.moviecatalog.utils;

import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TVWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.remote.response.MovieResponse;
import com.fathur.moviecatalog.data.source.remote.response.TVShowResponse;

import java.util.ArrayList;

public class DataDummy {
    public static ArrayList<MovieEntity> generateDummyMovies() {
        ArrayList<MovieEntity> movies = new ArrayList<>();

        movies.add(new MovieEntity("mv01",
                "Jiu Jitsu",
                "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                "Jim McGrath",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                false));

        movies.add(new MovieEntity("mv02",
                "Fatman",
                "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                "Eshom Nelms",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                false));

        movies.add(new MovieEntity("mv03",
                "Upside-Down Magic",
                "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                "Nick Pustay",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg",
                false));

        movies.add(new MovieEntity("mv04",
                "The Dalton Gang",
                "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly",
                "Christopher Forbes",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6OeGqp18oZucUGziMIRNhLouZ75.jpg",
                false));

        movies.add(new MovieEntity("mv05",
                "Hard Kill",
                "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                "Matt Eskandari",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                false));

        movies.add(new MovieEntity("mv06",
                "Magic Camp",
                "Andy, at the urging of his former mentor and Magic Camp owner Roy Preston, returns to the camp of his youth hoping to reignite his career. Instead, he finds inspiration in his ragtag bunch of rookie magicians.",
                "Jeff Judah",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/awcPLFFYjufRXd2oAAP6ZIXF9vM.jpg",
                false));


        movies.add(new MovieEntity("mv07",
                "Chick Fight",
                "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                "Chick Fight",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
                false));

        movies.add(new MovieEntity("mv08",
                "Bronx",
                "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                "Chris Sparling",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                false));

        movies.add(new MovieEntity("mv09",
                "Tenet",
                "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                false));

        movies.add(new MovieEntity("mv10",
                "Welcome to Sudden Death",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg",
                false));

        movies.add(new MovieEntity("mv11",
                "The Christmas Chronicles: Part Two",
                "Kate Pierce is reluctantly spending Christmas with her mom’s new boyfriend and his son Jack. But when the North Pole and Christmas are threatened to be destroyed, Kate and Jack are unexpectedly pulled into a new adventure with Santa Claus.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6sG0kbEvAi3RRLcGGU5h8l3qAPa.jpg",
                false));

        movies.add(new MovieEntity("mv12",
                "Money Plane",
                "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
                false));

        movies.add(new MovieEntity("mv13",
                "Greenland",
                "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                false));

        movies.add(new MovieEntity("mv14",
                "Roald Dahl's The Witches",
                "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has gathered.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/betExZlgK0l7CZ9CsCBVcwO1OjL.jpg",
                false));

        movies.add(new MovieEntity("mv15",
                "반도",
                "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg",
                false));

        movies.add(new MovieEntity("mv16",
                "Freaky",
                "A mystical, ancient dagger causes a notorious serial killer to magically switch bodies with a 17-year-old girl.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/8xC6QSyxrpm0D5A6iyHNemEWBVe.jpg",
                false));


        movies.add(new MovieEntity("mv17",
                "Mulan",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                false));

        movies.add(new MovieEntity("mv18",
                "Angela's Christmas Wish",
                "A determined Angela makes a wish to reunite her family in time for Christmas, then launches a plan to find her way from Ireland to Australia.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eu747ko823mktL3ygo7ohdZznP7.jpg",
                false));

        movies.add(new MovieEntity("mv19",
                "Enola Holmes",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                false));

        movies.add(new MovieEntity("mv20",
                "Alien Xmas",
                "A young elf mistakes a tiny alien for a Christmas gift, not knowing her new plaything has plans to destroy Earth's gravity — and steal all the presents.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3UGrAX6D1AMVra80jmUMUOLq8Qr.jpg",
                false));
        return movies;
    }

    public static ArrayList<TvShowEntity> generateDummyTvShow() {
        ArrayList<TvShowEntity> tvshow = new ArrayList<>();
        tvshow.add(new TvShowEntity("tv01",
                "The Mandalorian",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                false));

        tvshow.add(new TvShowEntity("tv02",
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "David Shore",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                false));

        tvshow.add(new TvShowEntity("tv03",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                false));

        tvshow.add(new TvShowEntity("tv04",
                "Selena: The Series",
                "As Mexican-American Tejano singer Selena comes of age and realizes her dreams, she and her family make tough choices to hold on to love and music.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mYsWyfiIMxx4HDm0Wck7oJ9ckez.jpg",
                false));


        tvshow.add(new TvShowEntity("tv05",
                "SEAL Team",
                "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                false));

        tvshow.add(new TvShowEntity("tv06",
                "30 Monedas",
                "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg",
                false));

        tvshow.add(new TvShowEntity("tv07",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                false));

        tvshow.add(new TvShowEntity("tv08",
                "Fear the Walking Dead",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \\\"The Walking Dead\\\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                false));

        tvshow.add(new TvShowEntity("tv09",
                "The Queen's Gambit",
                "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                false));

        tvshow.add(new TvShowEntity("tv10",
                "The Undoing",
                "Grace and Jonathan Fraser are living the only lives they ever wanted. Overnight a chasm opens in their lives: a violent death and a chain of terrible revelations. Left behind in the wake of a spreading and very public disaster, Grace must dismantle one life and create another for her child and her family.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3tDbJxobPN3EI2bBebL6zmusmw5.jpg",
                false));

        tvshow.add(new TvShowEntity("tv11",
                "His Dark Materials",
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                false));

        tvshow.add(new TvShowEntity("tv12",
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg",
                false));

        tvshow.add(new TvShowEntity("tv13",
                "Chicago P.D.",
                "A riveting police drama about the men and women of the Chicago Police Department's District 21 who put it all on the line to serve and protect their community. District 21 is made up of two distinctly different groups: the uniformed cops who patrol the beat and go head-to-head with the city's street crimes and the Intelligence Unit that combats the city's major offenses - organized crime, drug trafficking, high profile murders and beyond.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/OlPR1kctwXzSUJQkZINDDhNlHV.jpg",
                false));

        tvshow.add(new TvShowEntity("tv14",
                "FBI",
                "The New York office of the FBI brings to bear all their talents, intellect and technical expertise on major cases in order to keep their city and the country safe.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7aWmC7BjwBFgIKA77VqrXyRPicJ.jpg",
                false));

        tvshow.add(new TvShowEntity("tv15",
                "Falsa Identidad",
                "Isabel and Diego, two complete strangers, must assume the identity of a married couple in order to flee the state of Sonora.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/A8NqOX6Tol9srq9pS740q2ktgzH.jpg",
                false));

        tvshow.add(new TvShowEntity("tv16",
                "Station 19",
                "A group of heroic firefighters at Seattle Fire Station 19—from captain to newest recruit—risk their lives and hearts both in the line of duty and off the clock. These brave men and women are like family, literally and figuratively, and together they put their own lives in jeopardy as first responders to save the lives of others.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lcuCED5Ky2uM5VE6wILOwt5FEb0.jpg",
                false));

        tvshow.add(new TvShowEntity("tv17",
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                false));

        tvshow.add(new TvShowEntity("tv18",
                "I Am...",
                "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/oogunE22HDTcTxFakKQbwqfw1qo.jpg",
                false));

        tvshow.add(new TvShowEntity("tv19",
                "The Blacklist",
                "Raymond Red Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades, he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \\\"The Blacklist\\\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/htJzeRcYI2ewMm4PTrg98UMXShe.jpg",
                false));

        tvshow.add(new TvShowEntity("tv20",
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                false));
        return tvshow;
    }


    public static ArrayList<MovieResponse> generateRemoteDummyMovies() {
        ArrayList<MovieResponse> movies = new ArrayList<>();
        movies.add(new MovieResponse("mv01",
                "Jiu Jitsu",
                "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                "Jim McGrath",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg"));

        movies.add(new MovieResponse("mv02",
                "Fatman",
                "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                "Eshom Nelms",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg"));

        movies.add(new MovieResponse("mv03",
                "Upside-Down Magic",
                "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                "Nick Pustay",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg"));

        movies.add(new MovieResponse("mv04",
                "The Dalton Gang",
                "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly",
                "Christopher Forbes",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6OeGqp18oZucUGziMIRNhLouZ75.jpg"));

        movies.add(new MovieResponse("mv05",
                "Hard Kill",
                "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                "Matt Eskandari",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg"));

        movies.add(new MovieResponse("mv06",
                "Magic Camp",
                "Andy, at the urging of his former mentor and Magic Camp owner Roy Preston, returns to the camp of his youth hoping to reignite his career. Instead, he finds inspiration in his ragtag bunch of rookie magicians.",
                "Jeff Judah",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/awcPLFFYjufRXd2oAAP6ZIXF9vM.jpg"));


        movies.add(new MovieResponse("mv07",
                "Chick Fight",
                "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                "Chick Fight",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"));

        movies.add(new MovieResponse("mv08",
                "Bronx",
                "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                "Chris Sparling",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg"));

        movies.add(new MovieResponse("mv09",
                "Tenet",
                "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg"));

        movies.add(new MovieResponse("mv10",
                "Welcome to Sudden Death",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg"));

        movies.add(new MovieResponse("mv11",
                "The Christmas Chronicles: Part Two",
                "Kate Pierce is reluctantly spending Christmas with her mom’s new boyfriend and his son Jack. But when the North Pole and Christmas are threatened to be destroyed, Kate and Jack are unexpectedly pulled into a new adventure with Santa Claus.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6sG0kbEvAi3RRLcGGU5h8l3qAPa.jpg"));

        movies.add(new MovieResponse("mv12",
                "Money Plane",
                "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg"));

        movies.add(new MovieResponse("mv13",
                "Greenland",
                "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg"));

        movies.add(new MovieResponse("mv14",
                "Roald Dahl's The Witches",
                "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has gathered.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/betExZlgK0l7CZ9CsCBVcwO1OjL.jpg"));

        movies.add(new MovieResponse("mv15",
                "반도",
                "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg"));

        movies.add(new MovieResponse("mv16",
                "Freaky",
                "A mystical, ancient dagger causes a notorious serial killer to magically switch bodies with a 17-year-old girl.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/8xC6QSyxrpm0D5A6iyHNemEWBVe.jpg"));


        movies.add(new MovieResponse("mv17",
                "Mulan",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg"));

        movies.add(new MovieResponse("mv18",
                "Angela's Christmas Wish",
                "A determined Angela makes a wish to reunite her family in time for Christmas, then launches a plan to find her way from Ireland to Australia.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eu747ko823mktL3ygo7ohdZznP7.jpg"));

        movies.add(new MovieResponse("mv19",
                "Enola Holmes",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg"));

        movies.add(new MovieResponse("mv20",
                "Alien Xmas",
                "A young elf mistakes a tiny alien for a Christmas gift, not knowing her new plaything has plans to destroy Earth's gravity — and steal all the presents.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3UGrAX6D1AMVra80jmUMUOLq8Qr.jpg"));
        return movies;
    }

    public static ArrayList<TVShowResponse> generateRemoteDummyTvShow() {
        ArrayList<TVShowResponse> tvshow = new ArrayList<>();
        tvshow.add(new TVShowResponse("tv01",
                "The Mandalorian",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg"));

        tvshow.add(new TVShowResponse("tv02",
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "David Shore",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"));

        tvshow.add(new TVShowResponse("tv03",
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"));

        tvshow.add(new TVShowResponse("tv04",
                "Selena: The Series",
                "As Mexican-American Tejano singer Selena comes of age and realizes her dreams, she and her family make tough choices to hold on to love and music.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mYsWyfiIMxx4HDm0Wck7oJ9ckez.jpg"));


        tvshow.add(new TVShowResponse("tv05",
                "SEAL Team",
                "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg"));

        tvshow.add(new TVShowResponse("tv06",
                "30 Monedas",
                "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg"));

        tvshow.add(new TVShowResponse("tv07",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg"));

        tvshow.add(new TVShowResponse("tv08",
                "Fear the Walking Dead",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \\\"The Walking Dead\\\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg"));

        tvshow.add(new TVShowResponse("tv09",
                "The Queen's Gambit",
                "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg"));

        tvshow.add(new TVShowResponse("tv10",
                "The Undoing",
                "Grace and Jonathan Fraser are living the only lives they ever wanted. Overnight a chasm opens in their lives: a violent death and a chain of terrible revelations. Left behind in the wake of a spreading and very public disaster, Grace must dismantle one life and create another for her child and her family.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3tDbJxobPN3EI2bBebL6zmusmw5.jpg"));

        tvshow.add(new TVShowResponse("tv11",
                "His Dark Materials",
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg"));

        tvshow.add(new TVShowResponse("tv12",
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg"));

        tvshow.add(new TVShowResponse("tv13",
                "Chicago P.D.",
                "A riveting police drama about the men and women of the Chicago Police Department's District 21 who put it all on the line to serve and protect their community. District 21 is made up of two distinctly different groups: the uniformed cops who patrol the beat and go head-to-head with the city's street crimes and the Intelligence Unit that combats the city's major offenses - organized crime, drug trafficking, high profile murders and beyond.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/OlPR1kctwXzSUJQkZINDDhNlHV.jpg"));

        tvshow.add(new TVShowResponse("tv14",
                "FBI",
                "The New York office of the FBI brings to bear all their talents, intellect and technical expertise on major cases in order to keep their city and the country safe.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7aWmC7BjwBFgIKA77VqrXyRPicJ.jpg"));

        tvshow.add(new TVShowResponse("tv15",
                "Falsa Identidad",
                "Isabel and Diego, two complete strangers, must assume the identity of a married couple in order to flee the state of Sonora.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/A8NqOX6Tol9srq9pS740q2ktgzH.jpg"));

        tvshow.add(new TVShowResponse("tv16",
                "Station 19",
                "A group of heroic firefighters at Seattle Fire Station 19—from captain to newest recruit—risk their lives and hearts both in the line of duty and off the clock. These brave men and women are like family, literally and figuratively, and together they put their own lives in jeopardy as first responders to save the lives of others.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lcuCED5Ky2uM5VE6wILOwt5FEb0.jpg"));

        tvshow.add(new TVShowResponse("tv17",
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg"));

        tvshow.add(new TVShowResponse("tv18",
                "I Am...",
                "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/oogunE22HDTcTxFakKQbwqfw1qo.jpg"));

        tvshow.add(new TVShowResponse("tv19",
                "The Blacklist",
                "Raymond Red Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades, he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \\\"The Blacklist\\\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/htJzeRcYI2ewMm4PTrg98UMXShe.jpg"));

        tvshow.add(new TVShowResponse("tv20",
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"));
        return tvshow;
    }


    public static ArrayList<MovieEntity> generateDummyMoviesById(String movieId) {
        ArrayList<MovieEntity> movies = new ArrayList<>();

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Jiu Jitsu",
                "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                "Jim McGrath",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Fatman",
                "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                "Eshom Nelms",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Upside-Down Magic",
                "Nory and her best friend Reina enter the Sage Academy for Magical Studies, where Nory’s unconventional powers land her in a class for those with wonky, or “upside-down,” magic. Undaunted, Nory sets out to prove that that upside-down magic can be just as powerful as right-side-up.",
                "Nick Pustay",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xfYMQNApIIh8KhpNVtG1XRz0ZAp.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "The Dalton Gang",
                "When their brother Frank is killed by an outlaw, brothers Bob Dalton, Emmett Dalton and Gray Dalton join their local sheriff's department. When they are cheated by the law, they turn to crime, robbing trains and anything else they can steal from over the course of two years in the early 1890's. Trying to out do Jesse James, they attempt to rob two banks at once in October of 1892, and things get ugly",
                "Christopher Forbes",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6OeGqp18oZucUGziMIRNhLouZ75.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Hard Kill",
                "The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.",
                "Matt Eskandari",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Magic Camp",
                "Andy, at the urging of his former mentor and Magic Camp owner Roy Preston, returns to the camp of his youth hoping to reignite his career. Instead, he finds inspiration in his ragtag bunch of rookie magicians.",
                "Jeff Judah",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/awcPLFFYjufRXd2oAAP6ZIXF9vM.jpg",
                false));


        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Chick Fight",
                "When Anna Wyncomb is introduced to an an underground, all-female fight club in order to turn the mess of her life around, she discovers she is much more personally connected to the history of the club than she could ever imagine.",
                "Chick Fight",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Bronx",
                "Caught in the crosshairs of police corruption and Marseille’s warring gangs, a loyal cop must protect his squad by taking matters into his own hands.",
                "Chris Sparling",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Tenet",
                "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Welcome to Sudden Death",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "The Christmas Chronicles: Part Two",
                "Kate Pierce is reluctantly spending Christmas with her mom’s new boyfriend and his son Jack. But when the North Pole and Christmas are threatened to be destroyed, Kate and Jack are unexpectedly pulled into a new adventure with Santa Claus.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6sG0kbEvAi3RRLcGGU5h8l3qAPa.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Money Plane",
                "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Greenland",
                "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Roald Dahl's The Witches",
                "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has gathered.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/betExZlgK0l7CZ9CsCBVcwO1OjL.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "반도",
                "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Freaky",
                "A mystical, ancient dagger causes a notorious serial killer to magically switch bodies with a 17-year-old girl.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/8xC6QSyxrpm0D5A6iyHNemEWBVe.jpg",
                false));


        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Mulan",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "Niki Caro",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Angela's Christmas Wish",
                "A determined Angela makes a wish to reunite her family in time for Christmas, then launches a plan to find her way from Ireland to Australia.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/eu747ko823mktL3ygo7ohdZznP7.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Enola Holmes",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                false));

        movies.add(new MovieEntity(String.format("%sm1", movieId),
                "Alien Xmas",
                "A young elf mistakes a tiny alien for a Christmas gift, not knowing her new plaything has plans to destroy Earth's gravity — and steal all the presents.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3UGrAX6D1AMVra80jmUMUOLq8Qr.jpg",
                false));
        return movies;
    }

    public static ArrayList<TvShowEntity> generateDummyTvShowModuleId(String tvShowId) {
        ArrayList<TvShowEntity> tvshow = new ArrayList<>();
        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "The Mandalorian",
                "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives?",
                "David Shore",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Grey's Anatomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Selena: The Series",
                "As Mexican-American Tejano singer Selena comes of age and realizes her dreams, she and her family make tough choices to hold on to love and music.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mYsWyfiIMxx4HDm0Wck7oJ9ckez.jpg",
                false));


        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "SEAL Team",
                "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "30 Monedas",
                "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lw70w94nzCmIVSQvtMcuAjWHfWX.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Fear the Walking Dead",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \\\"The Walking Dead\\\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "The Queen's Gambit",
                "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "The Undoing",
                "Grace and Jonathan Fraser are living the only lives they ever wanted. Overnight a chasm opens in their lives: a violent death and a chain of terrible revelations. Left behind in the wake of a spreading and very public disaster, Grace must dismantle one life and create another for her child and her family.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3tDbJxobPN3EI2bBebL6zmusmw5.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "His Dark Materials",
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/g6tIKGc3f1H5QMz1dcgCwADKpZ7.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Chicago P.D.",
                "A riveting police drama about the men and women of the Chicago Police Department's District 21 who put it all on the line to serve and protect their community. District 21 is made up of two distinctly different groups: the uniformed cops who patrol the beat and go head-to-head with the city's street crimes and the Intelligence Unit that combats the city's major offenses - organized crime, drug trafficking, high profile murders and beyond.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/OlPR1kctwXzSUJQkZINDDhNlHV.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "FBI",
                "The New York office of the FBI brings to bear all their talents, intellect and technical expertise on major cases in order to keep their city and the country safe.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7aWmC7BjwBFgIKA77VqrXyRPicJ.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Falsa Identidad",
                "Isabel and Diego, two complete strangers, must assume the identity of a married couple in order to flee the state of Sonora.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/A8NqOX6Tol9srq9pS740q2ktgzH.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Station 19",
                "A group of heroic firefighters at Seattle Fire Station 19—from captain to newest recruit—risk their lives and hearts both in the line of duty and off the clock. These brave men and women are like family, literally and figuratively, and together they put their own lives in jeopardy as first responders to save the lives of others.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lcuCED5Ky2uM5VE6wILOwt5FEb0.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Game of Thrones",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "I Am...",
                "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/oogunE22HDTcTxFakKQbwqfw1qo.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "The Blacklist",
                "Raymond Red Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades, he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \\\"The Blacklist\\\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/htJzeRcYI2ewMm4PTrg98UMXShe.jpg",
                false));

        tvshow.add(new TvShowEntity(String.format("%sm1", tvShowId),
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ",
                "",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                false));
        return tvshow;
    }

    public static MovieWithModule generateDummyMovieWithModules(MovieEntity movies, boolean bookmarked) {
        MovieWithModule movieWithModule = new MovieWithModule();
        movieWithModule.mMovies = movies;
        movieWithModule.mMovies.setSelectMovie(bookmarked);
        movieWithModule.mModules = generateDummyMoviesById(movies.getMvid());
        return movieWithModule;
    }

    public static TVWithModule generateDummyTVWithModules(TvShowEntity tvShowEntity, boolean bookmarked) {
        TVWithModule tvWithModule = new TVWithModule();
        tvWithModule.mdataTv = tvShowEntity;
        tvWithModule.mdataTv.setSelectTVShow(bookmarked);
        tvWithModule.mModulesTv = generateDummyTvShowModuleId(tvShowEntity.getTvid());
        return tvWithModule;
    }
}
