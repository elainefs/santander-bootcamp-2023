import { Component, OnInit, Input } from '@angular/core';

@Component({
	selector: 'app-card',
	templateUrl: './card.component.html',
	styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {
	@Input()
  gameCover: string = '';
  
  // importado do card-label
  @Input()
	gameLabel: string = '';

  // importados do card-pricing
  @Input()
	gameType: string = 'Digital PS5';
	@Input()
	gamePrice: string = 'R$ 200,00';

	constructor() {}

	ngOnInit(): void {}
}
