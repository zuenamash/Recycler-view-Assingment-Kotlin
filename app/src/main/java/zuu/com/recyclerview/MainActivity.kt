package zuu.com.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zuu.com.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fibonacci=numbersdisplay(100)
    }
    fun numbersdisplay(size:Int):List<Int> {
        var numbers = listOf<Int>()
        var first = 0
        var firstsecond = 1 //fibonacci another default number
        var positions = 0

        while (positions < size) {
            first = firstsecond
            var sum = first + firstsecond
            firstsecond = sum

            positions++

            numbers += firstsecond


        }
        return numbers
    }}


