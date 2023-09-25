import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { dataFake } from '../../data/dataFake';

@Component({
	selector: 'app-content',
	templateUrl: './content.component.html',
	styleUrls: ['./content.component.css'],
})
export class ContentComponent implements OnInit {
	photoCover: string = '';
	contentTitle: string = '';
	contentDescription: string = '';
	private id: string | null = '0'; //define o id

	constructor(private route: ActivatedRoute) {} //define a rota

  // retorna o id
	ngOnInit(): void {
		this.route.paramMap.subscribe((value) => (this.id = value.get('id')));

    this.setValuesToComponent(this.id)
	}

  // define os valores que o id retorna automaticamente a partir do dataFake
	setValuesToComponent(id: string | null) {
		const result = dataFake.filter((article) => article.id == id)[0];
  
		this.contentTitle = result.title;
		this.contentDescription = result.description;
		this.photoCover = result.photoCover;
	}
}
