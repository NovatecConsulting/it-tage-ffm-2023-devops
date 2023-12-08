/* eslint no-unused-vars: 0 */
/* eslint no-undef: 0 */

import { render, screen } from '@testing-library/react';
import App from './App';

test('test button', () => {
  render(<App />);
  const linkElement = screen.getByText(/Test mich/i);
  expect(linkElement).toBeInTheDocument();
});

test('test app', () => {
  render(<App />);
  const linkElement = screen.getByText(/App.js/i);
  expect(linkElement).toBeInTheDocument();
});
