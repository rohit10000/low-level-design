<h1>Low Level Design</h1>
<br>
<hr>

<div>
  <b><i><p>Encapsulation</p></i></b>
</div>

![alt text](./lld-in-java/images/encapsulation.png)

<div>
<p>
	class Bird {
		string name, color, gender;
		public:
			Bird(string n, string c, string g) {
				name = n;
				color = c;
				gender = g;
			}

	};

	int main() {

		Bird b("gauraiya", "brown", "female");
		return 0;
	}

The above code has three problem:
<ol>
<li>Dirty code.</li>
<li>Client have to remember the sequence of parameter.</li>
<li>Backward compatibility.</li>
</ol>

Problems can be solved using Builder pattern.
</p>
</div>
