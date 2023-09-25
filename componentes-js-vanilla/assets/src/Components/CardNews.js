class CardNews extends HTMLElement {
  constructor() {
    super();

    const shadow = this.attachShadow({ mode: "open" });
    shadow.appendChild(this.build());
    shadow.appendChild(this.styles());
  }

  build() {
    const componentRoot = document.createElement("div");
    componentRoot.setAttribute("class", "card");

    const cardLeft = document.createElement("div");
    cardLeft.setAttribute("class", "card__left");

    const autor = document.createElement("span");
    cardLeft.appendChild(autor);
    autor.textContent = "By " + (this.getAttribute("autor") || "Anonymous");

    const linkTitle = document.createElement("a");
    cardLeft.appendChild(linkTitle);
    linkTitle.textContent = this.getAttribute("title");
    linkTitle.href = this.getAttribute("link-url"); 

    const newsContent = document.createElement("p");
    cardLeft.appendChild(newsContent);
    newsContent.textContent = this.getAttribute("content");

    const cardRight = document.createElement("div");
    cardRight.setAttribute("class", "card__right");

    const newsImage = document.createElement("img");
    cardRight.appendChild(newsImage);
    newsImage.src = this.getAttribute("photo");
    newsImage.alt = "Foto da Noticia";

    componentRoot.appendChild(cardLeft); 
    componentRoot.appendChild(cardRight);

    return componentRoot;
  }

  styles() {
    const style = document.createElement("style");
    style.textContent = `
    .card {
      width: 80%;
      margin: 30px auto;
      display: flex;
      flex-direction: row;
      box-shadow: 9px 9px 20px 0 #000;
      justify-content: space-between;
    }
    
    .card__left {
      display: flex;
      flex-direction: column;
      justify-content: center;
      padding-left: 10px;
      width: 50%;
    }
    
    .card__left > span {
      font-weight: 400;
    }
    
    .card__left > a {
      margin-top: 15px;
      font-size: 25px;
      color: #000;
      text-decoration: none;
      font-weight: 700;
    }

    .card__left > p {
      color: #00000090;
    }
    
    .card__right img {
      width: 100%;
      float: right;
    }
    `;
    return style;
  }
}

customElements.define("card-news", CardNews);