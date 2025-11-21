import { Component } from '@angular/core';
import { TaskListComponent } from './components/task-list/task-list.component';
import { FooterComponent } from './components/footer/footer.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [TaskListComponent, FooterComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  isDarkMode = false;

  toggleTheme(): void {
    this.isDarkMode = !this.isDarkMode;
    const theme = this.isDarkMode ? 'dark' : 'light';
    // A linha abaixo é a única mudança importante:
    // Nós aplicamos o atributo DIRETAMENTE na tag <body> do documento.
    document.body.setAttribute('data-theme', theme);
  }
}