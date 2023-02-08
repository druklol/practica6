import kotlin.random.Random


fun main(){
    var rnd1:Int

    
    var rnd2:Int
    var k:Int=0
    println("Массив N x M")
    println("Введите размер массива n")
    val n= readLine().toString().toInt()+2
    println("Введите размер массива m")
    val m= readLine().toString().toInt()+2
    println("Введите кол-во бомб")
    val bombs= readLine().toString().toInt()
    var mass = Array(n, { Array(m,{"0"}) })
    if(bombs<n*m) {
        while(k<bombs)
        {
            rnd1=Random.nextInt(1,n-1)
            rnd2=Random.nextInt(1,m-1)
            if(mass[rnd1][rnd2]!="*")
            {
                mass[rnd1][rnd2]="*"
                k++

            }
        }

        for (i in 1..n-2)
        {
            for (j in 1..m-2)
            {
                if(mass[i][j]!="*")
                {
                    if(mass[i-1][j]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i-1][j-1]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i][j-1]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i+1][j-1]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i+1][j]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i+1][j+1]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i][j+1]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                    if(mass[i-1][j+1]=="*")
                        mass[i][j]=(mass[i][j].toString().toInt()+1).toString()
                }
                print(mass[i][j]+" ")
            }
            println()
        }
    }
    else
    {
        println("Кол-во бомб не может быть больше размера поля")
    }
    }
