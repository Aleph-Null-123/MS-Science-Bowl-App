package com.example.mssciencebowlapp

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val srcBtn = findViewById<Button>(R.id.question_source_btn)
        val qzBtn = findViewById<Button>(R.id.quiz_mode_btn)
        val home = findViewById<ConstraintLayout>(R.id.home)
        val quizMode = findViewById<ConstraintLayout>(R.id.quizMode)
        val quizEnd = findViewById<ConstraintLayout>(R.id.quiz_end)
        val endQuizBtn = findViewById<Button>(R.id.end_quiz_btn)
        val homeBtn = findViewById<Button>(R.id.home_btn)
        val w_ans = findViewById<TextView>(R.id.w_ans)
        val x_ans = findViewById<TextView>(R.id.x_ans)
        val y_ans = findViewById<TextView>(R.id.y_ans)
        val z_ans = findViewById<TextView>(R.id.z_ans)
        val question = findViewById<TextView>(R.id.question)
        val next_btn = findViewById<Button>(R.id.next_q_btn)
        val w_btn = findViewById<Button>(R.id.w_btn)
        val x_btn = findViewById<Button>(R.id.x_btn)
        val y_btn = findViewById<Button>(R.id.y_btn)
        val z_btn = findViewById<Button>(R.id.z_btn)
        val correct = findViewById<TextView>(R.id.correct)
        val incorrect = findViewById<TextView>(R.id.incorrect)
        val percent = findViewById<TextView>(R.id.percent)
        var num_correct = 0
        var num_incorrect = 0


        fun quiz(){
            quizMode.visibility = View.VISIBLE
            home.visibility = View.GONE
            quizEnd.visibility = View.GONE
            val questions:MutableList<String> = mutableListOf("Which of the following BEST describes the term static:","Approximately what fraction of Earth’s surface is covered by oceans:","Mary tried to lift her couch by exerting 500 newtons of force but it doesn’t budge. If the couch weighed 2,000 newtons, how much work did she do:","The hydrologic cycle describes the circulation of Earth’s:","Most of the heart is composed of which of the following types of tissues:","Which of the following clouds has little vertical development:","A weather forecast of 100% relative humidity suggests an increased possibility of:","Which of the following fossils is the oldest:","Which of the following can sometimes result after a moderate to severe blow to the head:","Which of the following is the most common source of energy for brain cells in humans:","Which of the following is NOT a mineral:","Which of the following is the hottest region of planet Earth:","If a chimpanzee were to throw darts at a Periodic Table, he would most likely hit an element with which of the following characteristics:","Which of the following has the most inertia:","Which of the following is the BEST example of the chemical weathering of rock:","Which of the following is a product found in most toothpastes for the purpose of making the teeth more resistant to decay by promoting remineralization:","Which of the following is often the LEAST reliable property of a mineral that is used in mineral identification:","Which of the following terms best describes the streak of a mineral:","Which of the following best describes a smaller stream that merges with a larger stream:","Which of the following is a structural adaptation of ducks that is most helpful in keeping them dry:","Which of the following is the closest synonym for motile:","Which of the following terms is used by microbiologists for a bacterium with a rod shape:","The lead-acid battery is most commonly found in:","Which of the following is a coastal morphology most characteristic of the west coast of the U.S.:","Which of the following best describes how a sedimentary rock can form:","Which of the following does the prefix “ambi” (spell out the letters a, m, b, i) mean, as in the word ambidextrous:","The greatest geophysical impacts from the movement of Earth’s lithospheric plates are most often seen and felt in which of the following areas:","If an animal has 42 chromosomes in its normal, non-gamete or somatic cells, what term would be given to the gametes that have 21 chromosomes:","The best evidence for the model of Earth's interior comes from the study of:","Which of the following is TRUE of the Richter Scale:","When using the periodic chart, what number gives the number of protons in a given element:","Which of the following is NOT true: ","Most blizzards that strike the continental U.S. most directly originated in which of the following locations:","Which of the following types of maps would be most useful on a hiking trip through the Alps:","Regarding computer technology, which of the following BEST describes the bit:","Which of the following is TRUE of gases:","Which of the following terms best describes the cleavage of a mineral:","Which of the following is a region of Earth’s atmosphere where convection is most likely to take place:","Which of the following is part of the nephron in the kidney:","Which of the following BEST explains why a concrete floor feels colder than a wooden floor if both are at 21ºC:")

            val option_w:MutableList<String> = mutableListOf("Stationary","one-half","zero","tides","epithelial","altostratus","rain","trilobite","Down syndrome","nucleic acid","quartz","the mantle","a naturally radioactive element","1 kilogram of iron","cracking of rock by plant roots","fluoride","magnetism","wavy","delta","an oil-producing gland","having a motor","tubular","automobiles","numerous estuaries","compaction and cementation","equal","at the center of the plates","somatic","seismology","values are always given in whole numbers","period number","compounds have atoms from more than one element","the Gulf of Alaska","synoptic","an analogue magnetic storage sequence","they have a definite shape","silky","troposphere","islet cells","wood is not as dense as concrete")

            val option_x:MutableList<String> = mutableListOf("Low","two-thirds","50 watts","water","connective","altocumulus","wind","snake","meningitis","proteins","topaz","the inner core","a solid at room temperature","2 kilograms of flour","rain percolating through limestone","melamine","specific gravity","tabular","rip-rap","hollow fur","using energy","bacillus","cell phones","depositional coast","slow cooling and hardening of magma","both","at plate boundaries","unigenetic","paleontology","a value of 5 has 50-times more energy than a 4","group number","atoms can bond together to make molecules","the Gulf of Mexico","topographic","a computer processor","they are highly compressible","brittle","stratosphere","ureter","concrete conducts heat better than wood")

            val option_y:MutableList<String> = mutableListOf("Constant","seven-tenths","500 joules","sediments","nervous","cirrus","rising temperature","petrified wood","impetigo","glucose","basalt","the outer core","a gas at room temperature","5 newtons of iron","frost action","titanium dioxide","color","translucent","streamer","darkly colored plumage","able to move","trichome","flashlights","extensive barrier islands","fast cooling and hardening of magma","neither","evenly distributed throughout the entire plate","haploid","paleomagnetism","it is based on a scale of 0-14","atomic number","all helium atoms have 1 more proton than all hydrogen atoms","along the Gulf Stream","planimetric","a memory value of 1 through 8","they behave like a fluid","perfect one way","tropopause","amygdala","wood is alive and concrete is not")

            val option_z:MutableList<String> = mutableListOf("Used","four-fifths","2000 joules","rocks","muscle","nimbostratus","drying conditions","megaladon tooth","concussion","pectins","diamond","the crust","a liquid at room temperature","4 kilograms of iron","abrasion","diethylene glycol","cleavage","brown","tributary","ability to float","living in water","cylindrical","laptop computers","rocky coast with small spits and pocket beaches","high temperature and pressure causing recrystalization","always","along rivereds within the plates","solitary","glaciology","it is based on a logarithmic scale","average atomic number","all oxygen molecules have 8 neutrons","in the North Sea","Mercator projection","a binary digit that stores information","their particles are in uniform motion","sub-metallic","thermosphere","glomerulus","concrete is much less elastic than wood")

            val correct_answers:MutableList<String> = mutableListOf("W","Y","W","X","Z","Y","W","W","Z","Y","Y","X","X","Z","X","W","Y","Z","Z","W","Y","X","W","Z","W","X","X","Y","W","Z","Y","Z","W","X","Z","X","Y","W","Z","X")

            fun newQuestion(){
               w_btn.setBackgroundColor(Color.parseColor("#3F51B5"))
                x_btn.setBackgroundColor(Color.parseColor("#3F51B5"))
                y_btn.setBackgroundColor(Color.parseColor("#3F51B5"))
                z_btn.setBackgroundColor(Color.parseColor("#3F51B5"))
                w_btn.setTextColor(Color.parseColor("#FFFFFF"))
                x_btn.setTextColor(Color.parseColor("#FFFFFF"))
                y_btn.setTextColor(Color.parseColor("#FFFFFF"))
                z_btn.setTextColor(Color.parseColor("#FFFFFF"))
                next_btn.isEnabled = false
                w_btn.isEnabled = true
                x_btn.isEnabled = true
                y_btn.isEnabled = true
                z_btn.isEnabled = true
                var i = (0 until questions.size+1).random() - 1
                question.text=questions[i]
                w_ans.text="W) "+option_w[i]
                x_ans.text="X) "+option_x[i]
                y_ans.text="Y) "+option_y[i]
                z_ans.text="Z) "+option_z[i]
                w_btn.setOnClickListener {
                    if ((correct_answers[i]).equals("W")){
                        num_correct++
                        w_btn.setTextColor(Color.parseColor("#00FF00"))
                        w_btn.setBackgroundColor(Color.GREEN)
                    }
                    else{
                        num_incorrect++
                        w_btn.setBackgroundColor(Color.RED)
                        w_btn.setTextColor(Color.parseColor("#FF0000"))
                        if ((correct_answers[i]).equals("X")){
                            x_btn.setBackgroundColor(Color.GREEN)
                            x_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("Y")){
                            y_btn.setBackgroundColor(Color.GREEN)
                            y_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("Z")){
                            z_btn.setBackgroundColor(Color.GREEN)
                            z_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                    }
                    next_btn.isEnabled = true
                    w_btn.isEnabled = false
                    x_btn.isEnabled = false
                    y_btn.isEnabled = false
                    z_btn.isEnabled = false
                    next_btn.setOnClickListener {
                        newQuestion()
                    }
                }
                x_btn.setOnClickListener {
                    if ((correct_answers[i]).equals("X")){
                        num_correct++
                        x_btn.setBackgroundColor(Color.GREEN)
                        x_btn.setTextColor(Color.parseColor("#00FF00"))
                    }
                    else{
                        num_incorrect++
                        x_btn.setBackgroundColor(Color.RED)
                        x_btn.setTextColor(Color.parseColor("#FF0000"))
                        if ((correct_answers[i]).equals("W")){
                            w_btn.setBackgroundColor(Color.GREEN)
                            w_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("Y")){
                            y_btn.setBackgroundColor(Color.GREEN)
                            y_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("Z")){
                            z_btn.setBackgroundColor(Color.GREEN)
                            z_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                    }
                    next_btn.isEnabled = true
                    w_btn.isEnabled = false
                    x_btn.isEnabled = false
                    y_btn.isEnabled = false
                    z_btn.isEnabled = false
                    next_btn.setOnClickListener {
                        newQuestion()
                    }
                }
                y_btn.setOnClickListener {
                    if ((correct_answers[i]).equals("Y")){
                        num_correct++
                        y_btn.setBackgroundColor(Color.GREEN)
                        y_btn.setTextColor(Color.parseColor("#00FF00"))
                    }
                    else{
                        num_incorrect++
                        y_btn.setBackgroundColor(Color.RED)
                        y_btn.setTextColor(Color.parseColor("#FF0000"))
                        if ((correct_answers[i]).equals("X")){
                            x_btn.setBackgroundColor(Color.GREEN)
                            x_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("W")){
                            w_btn.setBackgroundColor(Color.GREEN)
                            w_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("Z")){
                            z_btn.setBackgroundColor(Color.GREEN)
                            z_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                    }
                    next_btn.isEnabled = true
                    w_btn.isEnabled = false
                    x_btn.isEnabled = false
                    y_btn.isEnabled = false
                    z_btn.isEnabled = false
                    next_btn.setOnClickListener {
                        newQuestion()
                    }
                }
                z_btn.setOnClickListener {

                    if ((correct_answers[i]).equals("Z")){
                        num_correct++
                        z_btn.setBackgroundColor(Color.GREEN)
                        z_btn.setTextColor(Color.parseColor("#00FF00"))
                    }
                    else{
                        num_incorrect++
                        z_btn.setBackgroundColor(Color.RED)
                        z_btn.setTextColor(Color.parseColor("#FF0000"))
                        if ((correct_answers[i]).equals("X")){
                            x_btn.setBackgroundColor(Color.GREEN)
                            x_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("Y")){
                            y_btn.setBackgroundColor(Color.GREEN)
                            y_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                        if ((correct_answers[i]).equals("W")){
                            w_btn.setBackgroundColor(Color.GREEN)
                            w_btn.setTextColor(Color.parseColor("#00FF00"))
                        }
                    }
                    next_btn.isEnabled = true
                    w_btn.isEnabled = false
                    x_btn.isEnabled = false
                    y_btn.isEnabled = false
                    z_btn.isEnabled = false
                    next_btn.setOnClickListener {
                        newQuestion()
                    }
                }


            }
            newQuestion()



        }
        fun endQuiz(){
            percent.text="0%"
            correct.text = "Correct: "+(num_correct).toString()
            incorrect.text = "Incorrect: "+(num_incorrect).toString()
            if( num_correct + num_incorrect != 0){
                percent.text = ((num_correct*100)/((num_correct)+(num_incorrect))).toString() + "%"
            }
            else{
                percent.text="0%"
            }
            num_correct=0
            num_incorrect=0
        }

        fun start() {
            home.visibility = View.VISIBLE
            quizMode.visibility = View.GONE
            quizEnd.visibility = View.GONE
            srcBtn.setOnClickListener {
                val i = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://science.osti.gov/wdts/nsb/Regional-Competitions/Resources/MS-Sample-Questions")
                )
                startActivity(i)
            }
            qzBtn.setOnClickListener {
                //quiz mode
                quiz()

            }
            endQuizBtn.setOnClickListener {
                //end quiz mode
                quizMode.visibility = View.GONE
                home.visibility = View.GONE
                quizEnd.visibility = View.VISIBLE
                endQuiz()

            }
            homeBtn.setOnClickListener {
                start()
            }






        }


        start()



    }




}